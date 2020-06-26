package com.kindergarten.service.impl;

import com.kindergarten.mapper.KindergartenMapper;
import com.kindergarten.mapper.UserMapper;
import com.kindergarten.po.Kindergarten;
import com.kindergarten.po.User;
import com.kindergarten.service.KindergartenService;
import com.kindergarten.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KindergartenServiceImpl implements KindergartenService {

    @Resource
    private KindergartenMapper kindergartenMapper;

    @Override
    public Kindergarten getKindergartenById(Kindergarten kindergarten) {
        return kindergartenMapper.selectOne(kindergarten);
    }

    @Override
    public List<Kindergarten> getAllKindergarten() {
        return kindergartenMapper.selectAll();
    }
}

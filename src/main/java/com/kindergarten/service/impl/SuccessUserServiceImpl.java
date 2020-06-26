package com.kindergarten.service.impl;

import com.kindergarten.mapper.KindergartenMapper;
import com.kindergarten.mapper.SuccessUserMapper;
import com.kindergarten.mapper.UserMapper;
import com.kindergarten.po.Kindergarten;
import com.kindergarten.po.SuccessUser;
import com.kindergarten.po.User;
import com.kindergarten.service.SuccessUserService;
import com.kindergarten.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SuccessUserServiceImpl implements SuccessUserService {

    @Resource
    private SuccessUserMapper successUserMapper;

    @Override
    public int addSuccessUser(SuccessUser successUser) {
        return successUserMapper.insert(successUser);
    }

    @Override
    public List<SuccessUser> getSuccessUser(SuccessUser successUser) {
        return successUserMapper.select(successUser);
    }

    @Override
    public SuccessUser getSuccessUserById(SuccessUser successUser) {
        return successUserMapper.selectOne(successUser);
    }
}

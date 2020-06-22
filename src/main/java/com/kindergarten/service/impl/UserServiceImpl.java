package com.kindergarten.service.impl;

import com.kindergarten.mapper.UserMapper;
import com.kindergarten.po.User;
import com.kindergarten.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}

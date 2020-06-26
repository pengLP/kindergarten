package com.kindergarten.service.impl;

import com.kindergarten.mapper.KindergartenMapper;
import com.kindergarten.mapper.UserMapper;
import com.kindergarten.po.Kindergarten;
import com.kindergarten.po.User;
import com.kindergarten.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private KindergartenMapper kindergartenMapper;

    private void setObject(User user) {
        Kindergarten kindergarten = new Kindergarten();
        kindergarten.setId(user.getkId());
        user.setKindergarten(kindergartenMapper.selectOne(kindergarten));
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getUser(User user) {
        List<User> users = userMapper.select(user);
        for (User u:users) {
            setObject(u);
        }
        return users;
    }

    @Override
    public User getUserById(User user) {
        User u = userMapper.selectOne(user);
        setObject(u);
        return u;
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}

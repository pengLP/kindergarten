package com.kindergarten.service;

import com.kindergarten.po.User;

import java.util.List;

public interface UserService {

    int addUser(User user);
    List<User> getUser(User user);
    User getUserById(User user);
    int updateUser(User user);

}

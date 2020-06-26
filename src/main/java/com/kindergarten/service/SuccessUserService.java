package com.kindergarten.service;

import com.kindergarten.po.SuccessUser;
import com.kindergarten.po.User;

import java.util.List;

public interface SuccessUserService {

    int addSuccessUser(SuccessUser successUser);
    List<SuccessUser> getSuccessUser(SuccessUser successUser);
    SuccessUser getSuccessUserById(SuccessUser successUser);
}

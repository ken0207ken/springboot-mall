package com.yikai.springbootmall.service.impl;

import com.yikai.springbootmall.dao.UserDao;
import com.yikai.springbootmall.dto.UserRegisterRequest;
import com.yikai.springbootmall.model.User;
import com.yikai.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

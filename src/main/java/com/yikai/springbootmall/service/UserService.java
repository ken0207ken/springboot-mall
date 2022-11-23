package com.yikai.springbootmall.service;

import com.yikai.springbootmall.dto.UserLoginRequest;
import com.yikai.springbootmall.dto.UserRegisterRequest;
import com.yikai.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer id);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}

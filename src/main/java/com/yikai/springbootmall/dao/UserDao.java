package com.yikai.springbootmall.dao;

import com.yikai.springbootmall.dto.UserRegisterRequest;
import com.yikai.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

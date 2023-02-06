package com.chenwendy.dao;

import com.chenwendy.dto.UserRegisterRequest;
import com.chenwendy.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

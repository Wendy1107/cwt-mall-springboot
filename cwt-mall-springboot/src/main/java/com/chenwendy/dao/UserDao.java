package com.chenwendy.dao;

import com.chenwendy.dto.UserRegisterRequest;
import com.chenwendy.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

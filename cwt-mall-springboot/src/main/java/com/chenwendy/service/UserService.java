package com.chenwendy.service;

import com.chenwendy.dto.UserRegisterRequest;
import com.chenwendy.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}

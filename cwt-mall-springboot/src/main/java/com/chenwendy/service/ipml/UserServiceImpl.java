package com.chenwendy.service.ipml;

import com.chenwendy.dao.UserDao;
import com.chenwendy.dto.UserRegisterRequest;
import com.chenwendy.model.User;
import com.chenwendy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

package com.chenwendy.controller;

import com.chenwendy.dto.UserRegisterRequest;
import com.chenwendy.model.User;
import com.chenwendy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest){
        Integer userID = userService.register(userRegisterRequest);

        User user = userService.getUserById(userID);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}

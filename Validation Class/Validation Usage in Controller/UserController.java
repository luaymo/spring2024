package com.example.controller;

import com.example.model.User;
import com.example.util.ValidationUtil;

import javax.validation.Valid;

public class UserController {

    public UserController() {
        // Initialization
    }

    public void createUser(@Valid User user) {
        ValidationUtil.validate(user);
        // Logic to create user
    }
}

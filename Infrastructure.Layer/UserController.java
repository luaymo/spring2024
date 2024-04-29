package com.coffeeshop.controller;

import com.coffeeshop.domain.User;
import com.coffeeshop.service.UserService;
import com.coffeeshop.util.ValidationUtil;

import javax.validation.Valid;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User getUser(String userId) {
        return userService.getUserById(userId);
    }
    // Other user related endpoints
}

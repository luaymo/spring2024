package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.User;

public interface UserService {
    User registerUser(String email, String password, String username);
    User loginUser(String email, String password);
    User getUserById(Long userId);
}

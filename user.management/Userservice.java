package com.coffeeplace.service;

import com.coffeeplace.domain.User;

public interface UserService {
    User registerUser(String email, String password, String username);
    User loginUser(String email, String password);
    User getUserById(Long userId);
}

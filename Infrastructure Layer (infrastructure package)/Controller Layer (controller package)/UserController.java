package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.User;
import com.coffeeplace.coffeeshopapp.infrastructure.model.UserDTO;
import com.coffeeplace.coffeeshopapp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserDTO registerUser(@RequestBody UserDTO userDTO) {
        User user = userService.registerUser(userDTO.getEmail(), userDTO.getPassword(), userDTO.getUsername());
        return convertToDTO(user);
    }

    // other controller methods

    private UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setUsername(user.getUsername());
        return userDTO;
    }
}

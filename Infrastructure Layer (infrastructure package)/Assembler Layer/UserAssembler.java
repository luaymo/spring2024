package com.coffeeplace.coffeeshopapp.infrastructure.assembler;

import com.coffeeplace.coffeeshopapp.domain.User;
import com.coffeeplace.coffeeshopapp.infrastructure.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserAssembler {

    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setUsername(user.getUsername());
        return userDTO;
    }
}

package com.coffeeplace.coffeeshopapp.infrastructure.assembler;

import com.coffeeplace.coffeeshopapp.domain.MenuItem;
import com.coffeeplace.coffeeshopapp.infrastructure.model.MenuItemDTO;
import org.springframework.stereotype.Component;

@Component
public class MenuItemAssembler {

    public MenuItemDTO toDTO(MenuItem menuItem) {
        MenuItemDTO menuItemDTO = new MenuItemDTO();
        menuItemDTO.setId(menuItem.getId());
        menuItemDTO.setName(menuItem.getName());
        menuItemDTO.setPrice(menuItem.getPrice());
        menuItemDTO.setDescription(menuItem.getDescription());
        return menuItemDTO;
    }
}

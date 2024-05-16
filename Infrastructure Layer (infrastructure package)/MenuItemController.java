package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.MenuItem;
import com.coffeeplace.coffeeshopapp.infrastructure.model.MenuItemDTO;
import com.coffeeplace.coffeeshopapp.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/menuitems")
public class MenuItemController {

    private final MenuItemService menuItemService;

    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @PostMapping("/create")
    public MenuItemDTO createMenuItem(@RequestBody MenuItemDTO menuItemDTO) {
        MenuItem menuItem = menuItemService.createMenuItem(menuItemDTO.getName(), menuItemDTO.getPrice(), menuItemDTO.getDescription());
        return convertToDTO(menuItem);
    }

    @GetMapping
    public List<MenuItemDTO> getAllMenuItems() {
        return menuItemService.getAllMenuItems().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private MenuItemDTO convertToDTO(MenuItem menuItem) {
        MenuItemDTO menuItemDTO = new MenuItemDTO();
        menuItemDTO.setId(menuItem.getId());
        menuItemDTO.setName(menuItem.getName());
        menuItemDTO.setPrice(menuItem.getPrice());
        menuItemDTO.setDescription(menuItem.getDescription());
        return menuItemDTO;
    }
}

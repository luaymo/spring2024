package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.MenuItem;

import java.util.List;

public interface MenuItemService {
    MenuItem createMenuItem(String name, double price, String description);
    List<MenuItem> getAllMenuItems();
    MenuItem getMenuItemById(Long id);
    void deleteMenuItem(Long id);
}

package com.coffeeplace.coffeeshopapp.infrastructure.model;

import com.coffeeplace.coffeeshopapp.domain.OrderItem;

import java.util.List;

public class OrderDTO {
    private Long id;
    private Long userId;
    private List<OrderItem> items;
    private double totalPrice;
    
    // constructors, getters, and setters
}

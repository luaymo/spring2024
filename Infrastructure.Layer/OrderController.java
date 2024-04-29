package com.coffeeshop.controller;

import com.coffeeshop.domain.Order;
import com.coffeeshop.service.OrderService;

public class OrderController {
    private OrderService orderService;

    public OrderController() {
        this.orderService = new OrderService();
    }

    public void placeOrder(Order order) {
        orderService.placeOrder(order);
    }
    // Other order related endpoints
}

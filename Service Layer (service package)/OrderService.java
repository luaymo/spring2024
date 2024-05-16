package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.Order;
import com.coffeeplace.coffeeshopapp.domain.OrderItem;

import java.util.List;

public interface OrderService {
    Order createOrder(Long userId, List<OrderItem> items);
    List<Order> getOrdersByUserId(Long userId);
    List<Order> getAllOrders();
    double calculateTotalPrice(List<OrderItem> items);
}

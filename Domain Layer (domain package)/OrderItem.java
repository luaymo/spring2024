package com.coffeeplace.coffeeshopapp.domain;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Order order;
    
    @ManyToOne
    private MenuItem menuItem;
    private int quantity;
    
    // constructors, getters, and setters
}

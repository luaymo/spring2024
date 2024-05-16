package com.coffeeplace.coffeeshopapp.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private User user;
    
    @OneToMany(mappedBy = "order")
    private List<OrderItem> items = new ArrayList<>();
    
    private double totalPrice;
    
    // constructors, getters, and setters
}


package com.coffeeplace.coffeeshopapp.domain;

import javax.persistence.*;

@Entity
public class FavoriteCoffeeShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private CoffeeShop coffeeShop;

    // constructors, getters, and setters
}

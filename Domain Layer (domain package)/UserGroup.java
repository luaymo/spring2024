package com.coffeeplace.coffeeshopapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    private Set<User> users;

    // constructors, getters, and setters
}

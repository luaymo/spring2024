package com.coffeeplace.coffeeshopapp.infrastructure.model;

import java.util.Set;

public class UserGroupDTO {
    private Long id;
    private String name;
    private Set<Long> userIds;
    private Long userId; // For creating a new group with the initial user

    // constructors, getters, and setters
}

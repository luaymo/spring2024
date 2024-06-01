package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.CoffeeBean;

import java.util.List;

public interface CoffeeBeanService {
    CoffeeBean addCoffeeBean(String name, String origin, String roastLevel);
    List<CoffeeBean> getAllCoffeeBeans();
    CoffeeBean getCoffeeBeanById(Long id);
}

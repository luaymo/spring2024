package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.CoffeePlace;
import com.coffeeplace.coffeeshopapp.service.CoffeePlaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffeeplaces")
public class CoffeePlaceController {

    private final CoffeePlaceService coffeePlaceService;

    public CoffeePlaceController(CoffeePlaceService coffeePlaceService) {
        this.coffeePlaceService = coffeePlaceService;
    }

    @GetMapping
    public List<CoffeePlace> getAllCoffeePlaces() {
        return coffeePlaceService.getAllCoffeePlaces();
    }

    // other controller methods
}

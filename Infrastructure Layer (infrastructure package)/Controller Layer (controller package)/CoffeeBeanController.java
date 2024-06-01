package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.CoffeeBean;
import com.coffeeplace.coffeeshopapp.infrastructure.model.CoffeeBeanDTO;
import com.coffeeplace.coffeeshopapp.service.CoffeeBeanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/coffeebeans")
public class CoffeeBeanController {

    private final CoffeeBeanService coffeeBeanService;

    public CoffeeBeanController(CoffeeBeanService coffeeBeanService) {
        this.coffeeBeanService = coffeeBeanService;
    }

    @PostMapping("/add")
    public CoffeeBeanDTO addCoffeeBean(@RequestBody CoffeeBeanDTO coffeeBeanDTO) {
        CoffeeBean coffeeBean = coffeeBeanService.addCoffeeBean(coffeeBeanDTO.getName(), coffeeBeanDTO.getOrigin(), coffeeBeanDTO.getRoastLevel());
        return convertToDTO(coffeeBean);
    }

    @GetMapping
    public List<CoffeeBeanDTO> getAllCoffeeBeans() {
        return coffeeBeanService.getAllCoffeeBeans().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CoffeeBeanDTO getCoffeeBeanById(@PathVariable Long id) {
        CoffeeBean coffeeBean = coffeeBeanService.getCoffeeBeanById(id);
        return convertToDTO(coffeeBean);
    }

    private CoffeeBeanDTO convertToDTO(CoffeeBean coffeeBean) {
        CoffeeBeanDTO coffeeBeanDTO = new CoffeeBeanDTO();
        coffeeBeanDTO.setId(coffeeBean.getId());
        coffeeBeanDTO.setName(coffeeBean.getName());
        coffeeBeanDTO.setOrigin(coffeeBean.getOrigin());
        coffeeBeanDTO.setRoastLevel(coffeeBean.getRoastLevel());
        return coffeeBeanDTO;
    }
}

package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.FavoriteCoffeeShop;
import com.coffeeplace.coffeeshopapp.infrastructure.model.FavoriteCoffeeShopDTO;
import com.coffeeplace.coffeeshopapp.service.FavoriteCoffeeShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/favorites")
public class FavoriteCoffeeShopController {

    private final FavoriteCoffeeShopService favoriteCoffeeShopService;

    public FavoriteCoffeeShopController(FavoriteCoffeeShopService favoriteCoffeeShopService) {
        this.favoriteCoffeeShopService = favoriteCoffeeShopService;
    }

    @PostMapping("/add")
    public FavoriteCoffeeShopDTO addFavorite(@RequestBody FavoriteCoffeeShopDTO favoriteCoffeeShopDTO) {
        FavoriteCoffeeShop favorite = favoriteCoffeeShopService.addFavorite(favoriteCoffeeShopDTO.getUserId(), favoriteCoffeeShopDTO.getCoffeeShopId());
        return convertToDTO(favorite);
    }

    @GetMapping("/user/{userId}")
    public List<FavoriteCoffeeShopDTO> getUserFavorites(@PathVariable Long userId) {
        return favoriteCoffeeShopService.getUserFavorites(userId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private FavoriteCoffeeShopDTO convertToDTO(FavoriteCoffeeShop favorite) {
        FavoriteCoffeeShopDTO favoriteCoffeeShopDTO = new FavoriteCoffeeShopDTO();
        favoriteCoffeeShopDTO.setId(favorite.getId());
        favoriteCoffeeShopDTO.setUserId(favorite.getUser().getId());
        favoriteCoffeeShopDTO.setCoffeeShopId(favorite.getCoffeeShop().getId());
        return favoriteCoffeeShopDTO;
    }
}

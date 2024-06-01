package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.FavoriteCoffeeShop;

import java.util.List;

public interface FavoriteCoffeeShopService {
    FavoriteCoffeeShop addFavorite(Long userId, Long coffeeShopId);
    List<FavoriteCoffeeShop> getUserFavorites(Long userId);
}

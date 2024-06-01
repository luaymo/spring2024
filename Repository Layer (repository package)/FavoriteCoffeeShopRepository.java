package com.coffeeplace.coffeeshopapp.repository;

import com.coffeeplace.coffeeshopapp.domain.FavoriteCoffeeShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteCoffeeShopRepository extends JpaRepository<FavoriteCoffeeShop, Long> {
}

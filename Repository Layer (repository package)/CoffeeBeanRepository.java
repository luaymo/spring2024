package com.coffeeplace.coffeeshopapp.repository;

import com.coffeeplace.coffeeshopapp.domain.CoffeeBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeBeanRepository extends JpaRepository<CoffeeBean, Long> {
}

package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.Promotion;

import java.util.List;

public interface PromotionService {
    Promotion createPromotion(String title, String description, LocalDate startDate, LocalDate endDate);
    List<Promotion> getAllPromotions();
    Promotion getPromotionById(Long id);
}

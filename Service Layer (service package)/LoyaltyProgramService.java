package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.LoyaltyProgram;

import java.util.List;

public interface LoyaltyProgramService {
    LoyaltyProgram createLoyaltyProgram(String name, String description, int points);
    List<LoyaltyProgram> getAllLoyaltyPrograms();
    LoyaltyProgram getLoyaltyProgramById(Long id);
}

package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.LoyaltyProgram;
import com.coffeeplace.coffeeshopapp.infrastructure.model.LoyaltyProgramDTO;
import com.coffeeplace.coffeeshopapp.service.LoyaltyProgramService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/loyaltyprograms")
public class LoyaltyProgramController {

    private final LoyaltyProgramService loyaltyProgramService;

    public LoyaltyProgramController(LoyaltyProgramService loyaltyProgramService) {
        this.loyaltyProgramService = loyaltyProgramService;
    }

    @PostMapping("/create")
    public LoyaltyProgramDTO createLoyaltyProgram(@RequestBody LoyaltyProgramDTO loyaltyProgramDTO) {
        LoyaltyProgram loyaltyProgram = loyaltyProgramService.createLoyaltyProgram(loyaltyProgramDTO.getName(), loyaltyProgramDTO.getDescription(), loyaltyProgramDTO.getPoints());
        return convertToDTO(loyaltyProgram);
    }

    @GetMapping
    public List<LoyaltyProgramDTO> getAllLoyaltyPrograms() {
        return loyaltyProgramService.getAllLoyaltyPrograms().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private LoyaltyProgramDTO convertToDTO(LoyaltyProgram loyaltyProgram) {
        LoyaltyProgramDTO loyaltyProgramDTO = new LoyaltyProgramDTO();
        loyaltyProgramDTO.setId(loyaltyProgram.getId());
        loyaltyProgramDTO.setName(loyaltyProgram.getName());
        loyaltyProgramDTO.setDescription(loyaltyProgram.getDescription());
        loyaltyProgramDTO.setPoints(loyaltyProgram.getPoints());
        return loyaltyProgramDTO;
    }
}

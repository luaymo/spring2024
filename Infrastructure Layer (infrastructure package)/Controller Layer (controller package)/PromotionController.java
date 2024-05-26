package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.Promotion;
import com.coffeeplace.coffeeshopapp.infrastructure.model.PromotionDTO;
import com.coffeeplace.coffeeshopapp.service.PromotionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @PostMapping("/create")
    public PromotionDTO createPromotion(@RequestBody PromotionDTO promotionDTO) {
        Promotion promotion = promotionService.createPromotion(promotionDTO.getTitle(), promotionDTO.getDescription(), promotionDTO.getStartDate(), promotionDTO.getEndDate());
        return convertToDTO(promotion);
    }

    @GetMapping
    public List<PromotionDTO> getAllPromotions() {
        return promotionService.getAllPromotions().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private PromotionDTO convertToDTO(Promotion promotion) {
        PromotionDTO promotionDTO = new PromotionDTO();
        promotionDTO.setId(promotion.getId());
        promotionDTO.setTitle(promotion.getTitle());
        promotionDTO.setDescription(promotion.getDescription());
        promotionDTO.setStartDate(promotion.getStartDate());
        promotionDTO.setEndDate(promotion.getEndDate());
        return promotionDTO;
    }
}

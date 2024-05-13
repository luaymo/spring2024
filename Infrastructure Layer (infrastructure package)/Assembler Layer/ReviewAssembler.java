package com.coffeeplace.coffeeshopapp.infrastructure.assembler;

import com.coffeeplace.coffeeshopapp.domain.Review;
import com.coffeeplace.coffeeshopapp.infrastructure.model.ReviewDTO;
import org.springframework.stereotype.Component;

@Component
public class ReviewAssembler {

    public ReviewDTO toDTO(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setId(review.getId());
        reviewDTO.setUserId(review.getUser().getId());
        reviewDTO.setComment(review.getComment());
        reviewDTO.setRating(review.getRating());
        return reviewDTO;
    }
}

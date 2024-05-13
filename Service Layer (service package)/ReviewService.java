package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.Review;

import java.util.List;

public interface ReviewService {
    Review createReview(Long userId, Long placeId, String comment, int rating);
    List<Review> getReviewsByPlaceId(Long placeId);
}

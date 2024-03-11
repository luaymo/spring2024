package com.coffeeplace.service;

import com.coffeeplace.domain.Review;

import java.util.List;

public interface ReviewService {
    Review createReview(Long userId, Long placeId, String comment, int rating);
    List<Review> getReviewsByPlaceId(Long placeId);
}

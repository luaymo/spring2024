package com.coffeeplace.service;

import com.coffeeplace.domain.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);
    // Внедрение зависимостей
    
    @Override
    public Review createReview(Long userId, Long placeId, String comment, int rating) {
        // Реализация создания отзыва
        logger.info("Review created by user with ID: {} for place with ID: {}", userId, placeId);
        // ваша реализация
    }
    
    @Override
    public List<Review> getReviewsByPlaceId(Long placeId) {
        // Реализация получения отзывов по ID места
        // ваша реализация
    }
}

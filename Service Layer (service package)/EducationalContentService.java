package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.EducationalContent;

import java.util.List;

public interface EducationalContentService {
    EducationalContent addContent(String title, String content);
    List<EducationalContent> getAllContent();
    EducationalContent getContentById(Long id);
}

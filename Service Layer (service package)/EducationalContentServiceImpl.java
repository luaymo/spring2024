package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.EducationalContent;
import com.coffeeplace.coffeeshopapp.repository.EducationalContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationalContentServiceImpl implements EducationalContentService {

    private final EducationalContentRepository repository;

    public EducationalContentServiceImpl(EducationalContentRepository repository) {
        this.repository = repository;
    }

    @Override
    public EducationalContent addContent(String title, String content) {
        EducationalContent educationalContent = new EducationalContent();
        educationalContent.setTitle(title);
        educationalContent.setContent(content);
        return repository.save(educationalContent);
    }

    @Override
    public List<EducationalContent> getAllContent() {
        return repository.findAll();
    }

    @Override
    public EducationalContent getContentById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.EducationalContent;
import com.coffeeplace.coffeeshopapp.infrastructure.model.EducationalContentDTO;
import com.coffeeplace.coffeeshopapp.service.EducationalContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/educationalcontent")
public class EducationalContentController {

    private final EducationalContentService educationalContentService;

    public EducationalContentController(EducationalContentService educationalContentService) {
        this.educationalContentService = educationalContentService;
    }

    @PostMapping("/add")
    public EducationalContentDTO addContent(@RequestBody EducationalContentDTO educationalContentDTO) {
        EducationalContent content = educationalContentService.addContent(educationalContentDTO.getTitle(), educationalContentDTO.getContent());
        return convertToDTO(content);
    }

    @GetMapping
    public List<EducationalContentDTO> getAllContent() {
        return educationalContentService.getAllContent().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private EducationalContentDTO convertToDTO(EducationalContent content) {
        EducationalContentDTO educationalContentDTO = new EducationalContentDTO();
        educationalContentDTO.setId(content.getId());
        educationalContentDTO.setTitle(content.getTitle());
        educationalContentDTO.setContent(content.getContent());
        return educationalContentDTO;
    }
}

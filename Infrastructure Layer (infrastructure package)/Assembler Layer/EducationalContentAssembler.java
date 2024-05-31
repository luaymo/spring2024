package com.coffeeplace.coffeeshopapp.infrastructure.assembler;

import com.coffeeplace.coffeeshopapp.domain.EducationalContent;
import com.coffeeplace.coffeeshopapp.infrastructure.model.EducationalContentDTO;
import org.springframework.stereotype.Component;

@Component
public class EducationalContentAssembler {

    public EducationalContentDTO toDTO(EducationalContent content) {
        EducationalContentDTO educationalContentDTO = new EducationalContentDTO();
        educationalContentDTO.setId(content.getId());
        educationalContentDTO.setTitle(content.getTitle());
        educationalContentDTO.setContent(content.getContent());
        return educationalContentDTO;
    }
}

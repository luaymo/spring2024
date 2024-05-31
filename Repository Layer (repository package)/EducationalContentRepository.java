package com.coffeeplace.coffeeshopapp.repository;

import com.coffeeplace.coffeeshopapp.domain.EducationalContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationalContentRepository extends JpaRepository<EducationalContent, Long> {
}

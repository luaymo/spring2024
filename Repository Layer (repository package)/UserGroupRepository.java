package com.coffeeplace.coffeeshopapp.repository;

import com.coffeeplace.coffeeshopapp.domain.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
}

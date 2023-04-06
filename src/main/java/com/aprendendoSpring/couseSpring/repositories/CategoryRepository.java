package com.aprendendoSpring.couseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.couseSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

package com.aprendendoSpring.couseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.couseSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

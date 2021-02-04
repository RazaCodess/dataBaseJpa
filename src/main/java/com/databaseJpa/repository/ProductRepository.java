package com.databaseJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databaseJpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

package com.spring.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);

}
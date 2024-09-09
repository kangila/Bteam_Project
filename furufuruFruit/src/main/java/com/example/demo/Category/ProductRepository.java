package com.example.demo.Category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.product;

public interface ProductRepository extends JpaRepository<product, Integer> {
	
	
		List<product> findByNameContaining(String keyword);
}

package com.example.demo.Cart.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.cart;
import com.example.demo.Entity.product;


public interface cartRepository extends JpaRepository<cart, Integer> {
	
	List<cart> findByProduct(product product);

}

package com.example.demo.productregist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.product;

// product 엔티티에 대한 CRUD(생성, 읽기, 업데이트, 삭제) 작업을 수행함. 
public interface ProductRepository extends JpaRepository<product, Integer> {

	
	
}

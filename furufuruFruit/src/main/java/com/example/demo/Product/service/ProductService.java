package com.example.demo.Product.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.product;

import com.example.demo.productregist.ProductregistRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	
	
    // 상품 등록 및 조회 가능 처리 - 동현 

	

	private final ProductregistRepository productRepository;
	
	public product saveProduct(product product) {
		return productRepository.save(product);
		

		
	}
	
}


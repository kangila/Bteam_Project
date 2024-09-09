package com.example.demo.Cart.service;
// 이순
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.cart;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@Service
public class cartService {

	private final cartRepository cr;
	
	public cart getcart(Integer cartId) {
		
		Optional<cart> c1 = this.cr.findById(cartId);
		return c1.get();
		
	}
}

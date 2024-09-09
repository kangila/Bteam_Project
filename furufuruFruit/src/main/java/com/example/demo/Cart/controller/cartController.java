package com.example.demo.Cart.controller;
// 이순
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.DetailPage.service.detailpageservice;
import com.example.demo.Cart.service.cartService;
import com.example.demo.Entity.cart;
import com.example.demo.Entity.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class cartController {
	
	private final cartService cr;
	private final detailpageservice dpR;
	
	@GetMapping("/cart/{cartId}/{productId}")
	public String cart(Model model,
			@PathVariable(value = "cartId") Integer cartId,
			@PathVariable(value = "productId") Integer product) {
		product p = this.dpR.getproduct(product);
		model.addAttribute("product", p);
		cart c = this.cr.getcart(cartId);
		model.addAttribute("cart", c);
		return "cart/cart";
	}

}

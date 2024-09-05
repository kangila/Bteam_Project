package com.example.demo.DetailPage.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class detailPageController {
	
	@GetMapping("/detail")
	public String detail() {
		
		return "detail_page/detailPage";
	}
	
//	@GetMapping("/cart")
//	public String cart() {
//		
//		return "cart/cart";
//	}
	


}

package com.example.demo.Category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class categoryController {

	
	@GetMapping("/category")
	public String category() {		
		return "/category/category";
	}
	
	
	
	
	
	
	
}

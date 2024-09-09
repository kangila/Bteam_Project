package com.example.demo.Category.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Category.service.CategoryService;
import com.example.demo.DetailPage.service.detailpageservice;
import com.example.demo.Entity.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class categoryController {

	private final CategoryService cs;
	
	@GetMapping("/category")
	public String category() {		
		return "/category/category";
	}
	
	
	@GetMapping("/searchproduct")	   
	   public String searchCourse(@RequestParam(value ="keyword")String keyword, Model model, product product)
	{
	      List<product> plist = this.cs.search(keyword);

	      model.addAttribute("productList", plist);
	      return "/category/category";
	   }
	
	
	
	
}

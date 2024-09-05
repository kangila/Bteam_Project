package com.example.demo.Main.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.product;
import com.example.demo.Main.service.MainService;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainController {

	private final MainService ms;
	
	@GetMapping("/main")
	public String main() {
		return "/main/main";
		
	}
	
	
	@GetMapping("/searchproduct")	   
	   public String searchProduct(@RequestParam(value ="keyword")String keyword, Model model){
	      List<product> plist = this.ms.search(keyword);
	      model.addAttribute("productList", plist);
	      return "redirect:/main/main";
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}

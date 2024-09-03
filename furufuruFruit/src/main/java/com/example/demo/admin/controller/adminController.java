package com.example.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adminController {
	
	@GetMapping("/master")
	public String admin() {
		
		return "admin/admin_main";
	}
	
	@GetMapping("/admin_sub_user")
	public String admin_sub_center() {
		
		return "admin/admin_sub_user";
	}

}

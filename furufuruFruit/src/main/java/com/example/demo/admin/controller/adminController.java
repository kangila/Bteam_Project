
package com.example.demo.admin.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entity.servicecenterquestion;
import com.example.demo.admin.service.adminService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class adminController {
	
	private final adminService ar;


	@GetMapping("/master")
	public String start() {
		
		return "admin/admin_main";
	}
	
	@GetMapping("/admin/sub_user")
	public String startSub() {
		
		return "admin/admin_sub_user";
	}
	
	@GetMapping("/admin/sub_center")
	public String startSubCenter(Model model) {
		
		List<servicecenterquestion> questionList = this.ar.getQustionList();
		
		model.addAttribute("questionList", questionList);
		
		return "admin/admin_sub_center";
	}



	@GetMapping("/admin_sub_center_detail")
	public String subCenterdetail() {
	
		return "admin/admin_sub_center_detail";
	}





}
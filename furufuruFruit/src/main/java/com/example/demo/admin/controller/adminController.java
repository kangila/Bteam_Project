package com.example.demo.admin.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.admin.model.Servicecenterquestion;
import com.example.demo.admin.service.ServicecenterquestionService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class adminController {
	public final ServicecenterquestionService scqr;
	
	@GetMapping("/master") // 유저 / 고객센터 선택 버튼
	public String admin() {
		
		return "admin/admin_main";
	}
	
	@GetMapping("/admin_sub_user") // 유저 목록
	public String admin_sub_user() {
		
		return "admin/admin_sub_user";
	}
	
	@GetMapping("/admin_sub_center") // 고객센터 문의글 목록
	public String admin_sub_center(Model model, @PathVariable("id") Integer cquestion_id) {
		Servicecenterquestion scq = this.scqr.getServicecenterquestion(cquestion_id);
		
		return "admin/admin_sub_center";
	}
	
	
	@GetMapping("/admin_sub_center_detail") // 고객센터 문의글 상세페이지
	public String admin_sub_center_detail() {


		return "admin/admin_sub_center_detail";
	}

}

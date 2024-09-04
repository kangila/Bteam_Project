package com.example.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    // 1. 컨트롤러 생성 

public class adminController {

	


	@GetMapping("/master") // 2. admin_main 페이지의 url 지정
	
	public String admaster() {
		
	return "admin/admin_main"; // 3. master라는 주소로 접근시 뜨는 html 파일
	
	}
	
	
	
	
	@GetMapping("/admin_sub_user") // 1. admin_sub_user 페이지의 url 경로를 지정한다. 
	public String admin_sub_center() {
		
		return "admin/admin_sub_user";// 2. admin_user 주소로 접근했을 때 열린 html 파일을 호출.
			}
	

@GetMapping("admin/admin_main")
public String admin() {

	return "admin/admin_sub_center";

}


@GetMapping("/admin_sub_center")
public String adminsub() {
	return "admin/admin_sub_center";
}


@GetMapping("/admin_sub_center_detail")   // 
public String subCenterdetail() {

	return "admin/admin_sub_center_detail";

	

				}
}




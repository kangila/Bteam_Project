package com.example.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class adminController {


@GetMapping("/admin_main")
public String admin() {

	return "admin/admin_sub_center";

}

@GetMapping("/admin_sub_center_detail")
public String subCenterdetail() {

	return "admin/admin_sub_center_detail";
}



}
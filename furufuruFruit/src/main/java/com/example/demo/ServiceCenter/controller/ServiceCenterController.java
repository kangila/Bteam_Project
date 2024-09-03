package com.example.demo.ServiceCenter.controller;

import java.security.Principal;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.ServiceCenter.AnswerForm;
import com.example.demo.ServiceCenter.QuestionForm;
import com.example.demo.ServiceCenter.servicecenterquestion;
import com.example.demo.ServiceCenter.Exception.UserException;
import com.example.demo.ServiceCenter.Service.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ServiceCenterController {
	
	private final QuestionService qr;
	
	@GetMapping("/csc")
	public String SCenter(Model model, @RequestParam(value="page", defaultValue="0") int page) {
		Page<servicecenterquestion> paging = this.qr.getList(page);
		
		model.addAttribute("paging", paging);
		
		return "csc/CSC_form";
	}
	
	
	
	@GetMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) 
			throws UserException {
		servicecenterquestion q = this.qr.getQuestion(id);
		model.addAttribute("question",  q);
		return "inquiry";
		
	}
	
	
	@GetMapping("/csc/inquiry")
	public String questionCreate(QuestionForm questionForm) {

		return "csc/CSC_form2";
	}

	
	@PostMapping("/csc/inquiry")
	public String questionCreate(@Valid QuestionForm questionForm, 
				BindingResult bindingResult) throws UserException {
		
		if(bindingResult.hasErrors()) {
			return "csc/CSC_form2";
		}
		
		this.qr.create(questionForm.getTitle(), questionForm.getContents());
		return "redirect:/csc";
	}
	
}

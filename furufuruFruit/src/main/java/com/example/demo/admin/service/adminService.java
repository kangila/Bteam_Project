package com.example.demo.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.admin.model.servicecenterQuestionRepository;
import com.example.demo.admin.model.servicecenterquestion;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class adminService {

	private final servicecenterQuestionRepository ar;
	
	public List<servicecenterquestion> getQustionList(){
		//질문글 목록 모든 데이터를 가져오는 메소드
		
		List<servicecenterquestion> questionList = this.ar.findAll();
		
		return questionList;
	}
}

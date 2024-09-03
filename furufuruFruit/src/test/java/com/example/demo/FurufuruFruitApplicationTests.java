package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.admin.model.servicecenterQuestionRepository;
import com.example.demo.admin.model.servicecenterquestion;

@SpringBootTest
class FurufuruFruitApplicationTests {

	@Autowired
	private servicecenterQuestionRepository ar;
	
	@Test
	void contextLoads() {
		
		List<servicecenterquestion> questionList = this.ar.findAll();
		
		System.out.println(questionList.toString());
		
	}

}

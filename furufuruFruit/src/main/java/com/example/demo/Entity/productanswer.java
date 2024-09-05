package com.example.demo.Entity;

import java.time.LocalDateTime;

//java.util.List; 있었는데 경고창 발생으로 지움
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class productanswer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer panswerId;
	
	private Integer pquestionId; 
	private Integer saleuserId;
	private String title;
	private String contents;
	private LocalDateTime answerDate;
	
	
	
}

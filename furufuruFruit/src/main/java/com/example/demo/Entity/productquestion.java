package com.example.demo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class productquestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pquestionId;
	
	private Integer buyuserId;
	private String title;
	private String contents;
	private LocalDateTime questionDate;
	
	
	
}

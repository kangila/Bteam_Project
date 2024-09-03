package com.example.demo.ServiceCenter;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.Queue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class servicecenteranswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer canswer_id;
	

	private String contents;

	private LocalDateTime answer_date;
	
	@OneToOne
	private servicecenterquestion cquestion_id;

	
	
	
	
	
}

package com.example.demo.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class buyuser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer buyuserId;
	
	private String id;
	private String pw;
	private String email;
	private String name;
	private String tell;
	private String address;
	private String gender;
	private LocalDateTime registerDate;
	
	@OneToMany(mappedBy = "buyuser", cascade = CascadeType.REMOVE)
	private List<servicecenterquestion> questionList;
}
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
public class coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer couponId;
	
	private Integer buyuser;
	private String useYn;
	private LocalDateTime couponDate;
	
	
	
}

package com.example.demo.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class saleuser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer saleuserId;
	
	@Column(nullable = false)
	private String id;
	
	@Column(nullable = false)
	private String pw;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String tell;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private LocalDateTime registerDate;
	
	@OneToMany(mappedBy = "saleuser", cascade = CascadeType.REMOVE)
	private List<product> productList;
	
}

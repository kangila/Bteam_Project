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
public class wishlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer wishlistId;
	
	private Integer buyuserId;
	private Integer productId;
	private LocalDateTime wishlistDate;
	
}

package com.example.demo.Product.service;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.product;

import com.example.demo.productregist.ProductregistRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	
	
    // 상품 등록 및 조회 가능 처리 - 동현 

	
  // 데이터를 저장하는 save. findall 같은 메서드를 가진 jpa 를 상속받는 productrepository를 가져옴.
	private final ProductregistRepository productRepository;
	
//	public void create(Question q, String content, SiteUser user) {
	
	
	// 상품을 생성하는 기능 = createProduct 
	public product createProduct(product pd, String name, String category, Integer price, Integer amount, String path, String explan) {
	
		
		// pd = product 객체 나타내는 매개변수 
		// 상품 정보를 설정함. 
		// 위의 파라미터값 그대로 
		pd.setName(name);              
		pd.setCategory(category);
		pd.setPrice(price);
		pd.setAmount(amount);
		pd.setPath(path);
		pd.setExplan(explan);

		
		
		// 수정이 된 제품 객체를 반환함. 
		return productRepository.save(pd);
		
		
	}
	
	
	
}


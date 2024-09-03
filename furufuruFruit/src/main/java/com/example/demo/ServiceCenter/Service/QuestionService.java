package com.example.demo.ServiceCenter.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.ServiceCenter.QuestionResponsitory;
import com.example.demo.ServiceCenter.servicecenterquestion;
import com.example.demo.ServiceCenter.Exception.UserException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

	private final QuestionResponsitory qr;


	
	public Page<servicecenterquestion> getList(int page){
		List<Sort.Order> sorts = new ArrayList<>();
		sorts.add(Sort.Order.desc("createDate"));
		Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
		return this.qr.findAll(pageable);
	}
	
	public servicecenterquestion getQuestion(Integer id) throws UserException {
		// 도전과제
		// 존재하지 않는 데이터를 조회할떄는
		// 데이터를 찾을수 없습니다 라는
		// PpakchimException을 구현해볼것.
		Optional<servicecenterquestion> q1 = this.qr.findById(id);
		if(q1.isPresent()) {
			return q1.get();
		}else {
			throw new UserException("데이터를 찾을수 없습니다");
		}
		
	}

	public void create(String subject, String content) {
		// TODO Auto-generated method stub
		servicecenterquestion q = new servicecenterquestion();
		q.setTitle(subject);
		q.setContents(content);
		q.setQuestion_date(LocalDateTime.now());
		this.qr.save(q);
	}
	
}

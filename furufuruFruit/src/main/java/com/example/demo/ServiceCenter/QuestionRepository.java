package com.example.demo.ServiceCenter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.servicecenterquestion;


public interface QuestionRepository extends JpaRepository<servicecenterquestion, Integer>{

}
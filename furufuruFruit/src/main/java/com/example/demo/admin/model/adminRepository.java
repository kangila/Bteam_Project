package com.example.demo.admin.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.buyuser;

public interface adminRepository extends JpaRepository<buyuser, Integer> {

}

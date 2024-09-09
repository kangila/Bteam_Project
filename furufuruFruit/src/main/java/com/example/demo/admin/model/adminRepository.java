package com.example.demo.admin.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.user;

public interface adminRepository extends JpaRepository<user, Integer> {

}

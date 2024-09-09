package com.example.demo.User.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.user;

public interface UserRepository extends JpaRepository<user, Long>{
	Optional<user> findById(String username);

}


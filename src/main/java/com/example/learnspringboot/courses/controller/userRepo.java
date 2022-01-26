package com.example.learnspringboot.courses.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<users, Long> {
	users findByUsername(String username);
	

}

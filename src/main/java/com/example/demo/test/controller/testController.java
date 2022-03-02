package com.example.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Test;
import com.example.demo.test.respository.testRepository;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class testController {

	private final testRepository repository;
	
	
	@GetMapping("/okTest")
	public String okTest() {
	 Test build = Test.builder()
		.age(0)
		.name("test")
		.build();

		repository.testInsert(build);
	 
		log.info("test");
	
		return "ok";
	}
	

}

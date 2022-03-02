package com.example.demo.domain;

import lombok.Builder;


public class Test {

	private String name;
	private int age;
	@Builder
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}

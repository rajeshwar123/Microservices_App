package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class Example {
	
	public Example() {
		System.out.println("Example() constructor");
	}
	public void getWelcomeMsg() {
		String msg="Welcome to Spring Boot";
		System.out.println(msg);
	}
}

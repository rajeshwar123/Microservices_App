package com.nt.eureka.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApp1RestController {
	public TestApp1RestController() {
		System.out.println("TestApp1RestController.TestApp1RestController()");
	}
	@GetMapping(value="/test1")
	public String getMsg() {
		return "Welcome to TestApp1";
	}

}

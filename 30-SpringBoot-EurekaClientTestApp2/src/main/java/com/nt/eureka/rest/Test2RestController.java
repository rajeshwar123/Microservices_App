package com.nt.eureka.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2RestController {
	public Test2RestController() {
		System.out.println("Test2RestController.Test2RestController()");
	}
	@GetMapping(value="/test2")
	public String getMsg() {
		return "Welcome to TestApp2";
	}

}

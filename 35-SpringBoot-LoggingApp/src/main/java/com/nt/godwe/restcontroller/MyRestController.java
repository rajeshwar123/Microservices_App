package com.nt.godwe.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	public MyRestController() {
		System.out.println("MyRestController.MyRestController()");
	}

	@GetMapping(value = "/getMsg")
	public String getMsg() {
		Logger logger = LoggerFactory.getLogger("LoggerRestApp");
		logger.info("getMsg() method started");
		String msg = "Welcome to Spring Boot App Logging";
		logger.info("getMsg() method ended");
		return msg;
	}
}

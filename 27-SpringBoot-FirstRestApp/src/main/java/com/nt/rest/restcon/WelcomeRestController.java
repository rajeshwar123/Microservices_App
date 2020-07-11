package com.nt.rest.restcon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	public WelcomeRestController() {
		System.out.println("WelcomeRestController.WelcomeRestController()");
	}
	@GetMapping(value="/welcome/{name}")
	public String wishMessage(@PathVariable("name") String name) {
		String msg="<h1 style='color:red;text-align:center'>"+name+". Welcome To Spring Boot</h1>";
		return msg;
	}
}

package com.nt.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value="/welcome")
	public String getMsg(Model model) {
		String s1="Welcome to Spring Boot";
		model.addAttribute("msg", s1);
		return "welcomePage";	
	}
}
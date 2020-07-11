package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//welcome controller
@Controller
public class MyController {
	public MyController() {
		System.out.println("MyController.MyController()");
	}

	//Handler method
	@RequestMapping(value="welcome")
	public String getWelcomeMsg(Model model) {
		String msgTxt="Welcome to SpringBoot";
		model.addAttribute("msg", msgTxt);
		//logical View name
		return "welcomePage";
	}//getWelcomeMsg()
	
	@RequestMapping(value="great")
	public String greeting(Model model,@RequestParam("name") String user) {
		String msgText=" Good Evening "+user;
		model.addAttribute("msg", msgText);
		return "greatingPage";
	}
	
}//class

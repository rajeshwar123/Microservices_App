package com.nt.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.test.pojo.User;

@Controller
public class UserController {	

	public UserController() {
		System.out.println("UserController.UserController()");
	}
	
	@RequestMapping(value="/registerUser")
	public String loadForm(Model model) {
		//create form binding object
		User userObj=new User();
		//add object to model attribute
		model.addAttribute("user", userObj);
		//logical view name
		return "userReg";
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		
		//here some database related logic
		
		model.addAttribute("successMsg","Registration Sucessfull");
		//logical view name
		return "userReg";
	}
}
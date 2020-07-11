package com.nt.atps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.atps.service.UserManagementService;
import com.nt.pojo.UserRegistrationDetails;

@Controller
public class UserRegController {
	
	@Autowired
	private UserManagementService service;
	
	public UserRegController() {
		System.out.println("HomePageController.HomePageController()");
	}
	
	/**
	 * to load home page
	 * @return String
	 */
	@RequestMapping(value="/homepage")
	public String loadHomePage() {
		return "welcome";
	}
	/**
	 * to load sign up page
	 * @param model
	 * @return String 
	 */
	@RequestMapping(value="/signUp")
	public String loadSignUpPage(Model model) {
		UserRegistrationDetails usrRegDtls=new UserRegistrationDetails();
		model.addAttribute("userRegDtls", usrRegDtls);
		return "signUpPage";
	}
	
	/**
	 * to registe User
	 * @param model
	 * @return String
	 */
	@RequestMapping(value="/regUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("userRegDtls") UserRegistrationDetails usrRegDtls, Model model) {
		//call service method
		service.registerUser(usrRegDtls);
		model.addAttribute("regMsg", "Welcome "+usrRegDtls.getFirstName()+",<br> Check your email to activate the account.");
		return "welcome";
	}
}
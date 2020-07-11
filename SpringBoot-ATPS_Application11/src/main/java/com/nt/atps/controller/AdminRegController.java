package com.nt.atps.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.atps.service.AdminMangementService;
import com.nt.pojo.AdminRegistrationDetails;

@Controller
public class AdminRegController {

	@Autowired
	AdminMangementService service;
    
	
	/**
	 * To load amdin Registration Form.
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminSignUp")
	public String loadAdminForm(Model model) {
		AdminRegistrationDetails adminRegDtls = new AdminRegistrationDetails();
		model.addAttribute("adminRegDtls", adminRegDtls);
		List<String> usrRollList = new ArrayList<String>();

		usrRollList.add("user");
		usrRollList.add("admin");
		usrRollList.add("agency");

		model.addAttribute("rollList", usrRollList);
		return "AdminCreateAccount";
	}

	/**
	 * to register admin
	 * 
	 * @param model
	 * @param admnRgDtls
	 * @return String
	 */
	@RequestMapping(value = "/regAdmin", method = RequestMethod.POST)
	public String registerAdmin(Model model, @ModelAttribute("adminRegDtls") AdminRegistrationDetails admnRgDtls) {

		// call service method
		service.registerAdmin(admnRgDtls);
		// set registration msg to model
		model.addAttribute("adminRegMsg",
				"Your Registration Successful.<br>please check your email to unlock your account.");
		return "welcome";
	}
}
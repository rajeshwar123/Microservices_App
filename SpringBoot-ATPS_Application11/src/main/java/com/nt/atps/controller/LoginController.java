package com.nt.atps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.atps.service.UserManagementService;
import com.nt.pojo.LoginUserDetails;

@Controller
public class LoginController {

	@Autowired
	UserManagementService service;

	@RequestMapping(value = "signIn")
	public String loadLoginPage(Model model) {
		LoginUserDetails loginDtls = new LoginUserDetails();
		model.addAttribute("loginData", loginDtls);
		return "signInPage";
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String loginUser(Model model, @ModelAttribute("loginData") LoginUserDetails loginDtls) {
		int count = service.loginRegUser(loginDtls.getUsername(), loginDtls.getPassword());

		String role = service.getRoleByEmail(loginDtls.getUsername());
		if (count != 0) {
			if (role.equals("admin")) {
				return "adminDashboard";
			} else if (role.equals("user")) {
				return "userDashboard";
			}
			else{
				return "agencyDashboard";
			}
		} 
		model.addAttribute("loginMsg", "Invalid Credentilals");
		return "welcome";
	}
}//class
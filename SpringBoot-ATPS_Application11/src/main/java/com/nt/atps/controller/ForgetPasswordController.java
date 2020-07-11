package com.nt.atps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.atps.service.UserManagementService;
import com.nt.pojo.ForgetPasswordDetails;

@Controller
public class ForgetPasswordController {
	@Autowired
	UserManagementService service;
	
	@RequestMapping(value="/forgetPwd")
	public String loadForgetPwdForm(Model model) {
		ForgetPasswordDetails fPwd=new ForgetPasswordDetails();
		model.addAttribute("fPwdData", fPwd);
		return "forgetPwd";
	}
	
	@RequestMapping(value="/recoverPwd",method=RequestMethod.POST)
	public String recoverPwdForm(Model model,@ModelAttribute() ForgetPasswordDetails fPwdDtls) {
		String emailId=fPwdDtls.getEmail();
		service.recoverPwdByEmail(emailId);
		model.addAttribute("recoverPwdMsg", "Please check your mail to recover Password.");
		return "welcome";
	}
}

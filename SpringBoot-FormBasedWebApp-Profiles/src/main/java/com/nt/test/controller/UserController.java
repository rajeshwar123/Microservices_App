package com.nt.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties.Couchbase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.test.constants.AppConstants;
import com.nt.test.pojo.User;
import com.nt.test.properties.AppProperties;

@Controller
public class UserController {
	
	@Autowired
	private AppProperties appProps;
	
	public UserController() {
		System.out.println("UserController.UserController()");
	}
	
	@RequestMapping(value=AppConstants.REQ_URL)
	public String loadForm(Model model) {
		//create form binding object
		User userObj=new User();
		
		
		List<String> contriesList=new ArrayList();
		
		//add countries to list
		contriesList.add("INDIA");
		contriesList.add("USA");
		contriesList.add("UK");
		contriesList.add("CHINA");
		contriesList.add("JAPAN");
		
		
		//add object to model attribute
		model.addAttribute("countries", contriesList);
		model.addAttribute("user", userObj);
		//logical view name
		return AppConstants.REG_USER;
	}
	
	@RequestMapping(value=AppConstants.REQ_URL,method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		//here some database related logic
		String msg=appProps.getMessages().get(AppConstants.GET_SUCC_MSG);
	
		model.addAttribute("successMsg",msg);
		//logical view name
		return AppConstants.REG_USER;
	}
}
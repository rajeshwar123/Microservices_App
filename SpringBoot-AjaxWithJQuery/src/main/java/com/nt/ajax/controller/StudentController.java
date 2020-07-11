package com.nt.ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.ajax.pojo.StudentModel;
import com.nt.ajax.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	public StudentController() {
		System.out.println("StudentController.StudentController()");
	}
	@RequestMapping("/s1")
	public String load() {
		return "regStudForm";
	}
	
	@RequestMapping(value="/loadForm",method=RequestMethod.GET)
	public String loadForm(Model model) {
		StudentModel pojo=new StudentModel();
		model.addAttribute("studData", pojo);
		return "regStudForm";
	}
	
	
	@RequestMapping(value="/regStudent")
	public String regStudent(@ModelAttribute("studData") StudentModel pojo,Model model) {
		int count=0;
		
		count=service.RegisterStudent(pojo);
		if(count==0) {
		model.addAttribute("regMsg", "Reg Failed");	
		}
		else
			model.addAttribute("regMsg", "Reg succeeded");
		
		return "regStudForm";
	}
}

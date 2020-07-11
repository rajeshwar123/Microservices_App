package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.nt.lms.model.MemberModel;
import com.nt.lms.service.UserManagementService;

@RestController
public class AddUserController {

	@Autowired
	UserManagementService service;
	
	@GetMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getWelcomeMsg() {
		return "welcome to LMS";
	}
	
	@PostMapping(value = "/addUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addUser(MemberModel memberModel) {
		service.addUser(memberModel);
		return new ResponseEntity<String>("Registration Sucessfull", HttpStatus.CREATED);
	}
}

package com.nt.lms.restcontroller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {

	@GetMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getMsg() {
		return "welcome";
	}

}

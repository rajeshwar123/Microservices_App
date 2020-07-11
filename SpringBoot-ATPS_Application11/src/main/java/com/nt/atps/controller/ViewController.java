package com.nt.atps.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ViewController {
	public String loadViewForm() {
		return "view";
	}
}
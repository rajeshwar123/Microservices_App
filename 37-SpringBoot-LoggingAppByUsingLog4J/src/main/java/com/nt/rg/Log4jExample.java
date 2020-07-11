package com.nt.rg;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

public class Log4jExample {
	
	//initializing logger obj for current class
	private static Logger logger=Logger.getLogger(Log4jExample.class);
	

	@RequestMapping(value="/getMsg")
	public String welcomeMsg() {
		
		return "Welcome to logging";
	}

}

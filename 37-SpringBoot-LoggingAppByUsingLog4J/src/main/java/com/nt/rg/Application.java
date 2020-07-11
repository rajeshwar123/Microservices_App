package com.nt.rg;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	// initializing logger obj for current class
	private static Logger logger = Logger.getLogger(Log4jExample.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		BasicConfigurator.configure();
		logger.trace("This is trace message");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
	}
}
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.dao.Example;

@SpringBootApplication
public class SpringBootFirstAppApplication {
	public SpringBootFirstAppApplication() {
		System.out.println("SpringBootFirstAppApplication.SpringBootFirstAppApplication()");
		
	}
	public static void main(String[] args) {		
		ApplicationContext ctx=SpringApplication.run(SpringBootFirstAppApplication.class, args);	
		
		
		Example ex=ctx.getBean(Example.class);
		ex.getWelcomeMsg();
	
	}
}
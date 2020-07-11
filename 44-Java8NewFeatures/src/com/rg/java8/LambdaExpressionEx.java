package com.rg.java8;

public class LambdaExpressionEx {

	public static void main(String[] args) {
		GreetingService service = message->System.out.println("Hello :" + message);		
		service.sayMessage("Lambda Expression");
		
		AdditionService service2=(a,b)->a+b;
		
		System.out.println(service2.addition(10, 20));
		
	}// main method

	interface GreetingService {
		void sayMessage(String message);
	}
	interface AdditionService {
		int addition(int a ,int b);
	}

}// class

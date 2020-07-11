package com.rg.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceEx {

	public void sayHi(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();

		names1.add("Rajesh");
		names1.add("Vikas");
		names1.add("Roshan");
		names1.add("Sopan");
		names1.add("Shubham");

		// static method reference Example
		names1.forEach(System.out::println);

	}
}
/*
 * interface PrintMessage{ public static void sayHello(String msg) {
 * System.out.println(msg); }
 * 
 * void sayHello(String msg); }
 */
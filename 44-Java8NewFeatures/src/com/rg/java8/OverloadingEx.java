package com.rg.java8;

public class OverloadingEx{
	
	public void m1(Object obj) {
		System.out.println("object");
	}
	public void m1(Integer in) {
		System.out.println("integer");
	}
	public void m1(String str) {
		System.out.println("string");
	}
}

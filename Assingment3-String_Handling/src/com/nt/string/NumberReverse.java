package com.nt.string;

public class NumberReverse {
	public static int reverse(int num) {
		int reverse=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			reverse=rem+(reverse*10);
			num=num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		System.out.println(NumberReverse.reverse(145));

	}
}
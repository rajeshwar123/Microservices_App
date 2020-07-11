package com.nt.string;

public class ReverseNumberEx {

	public static void main(String[] args) {
		int n=859;
		int reverse=0;
		while(n>0) {
			reverse=reverse*10;
			reverse=reverse+n%10;
			System.out.println("rem "+reverse);
			n=n/10;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
			System.out.println("reminder "+n);
		}	
	}
}

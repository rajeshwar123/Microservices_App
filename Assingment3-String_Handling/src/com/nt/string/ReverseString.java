package com.nt.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=null;
		String  s1=null;
		String  s2="";
		//create scanner object
		sc=new Scanner(System.in);
		
		System.out.println("enter a string:");
		//read input
		s1=sc.nextLine();
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("after reverse :"+s2);
		//close scanner
		sc.close();

	}

}

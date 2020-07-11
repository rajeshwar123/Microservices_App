package com.nt.string;

import java.util.Scanner;

public class ManageSpacesEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter sub");
		String msg = scn.next();
		System.out.println("enter num");
		int num = scn.nextInt();
		//System.out.printf( "%-15s%03d%n", msg, num);
		//System.out.printf("%03d%n",numd);
		System.out.printf("%-15s",msg);
	}
}
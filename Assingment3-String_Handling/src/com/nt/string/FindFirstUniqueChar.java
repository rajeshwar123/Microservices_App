package com.nt.string;

import java.util.Arrays;

public class FindFirstUniqueChar {

	public static void main(String[] args) {
		String str="Rajesharadfd";
		int temp = 0;
		for (int j = 0; j < str.length(); j++) {
			for (int i = j + 1; i < str.length(); i++) {
				if ((str.charAt(j)==str.charAt(i))) {
					System.out.println(str.charAt(j));
					str.replace(str.charAt(i),' ');
				}
			}
		}
	}
}
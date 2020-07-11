package com.nt.string;

public class ReverseWords {

	public static void main(String[] args) {
		String s1="java programming language";
		String s2="";
		String[] s3=s1.split(" ");
		String s4=null;
		System.out.println("before revese words :"+s1);
		
		for(int i=0;i<s3.length;i++) {
			s4=s3[i];
			for(int j=s4.length()-1;j>=0;j--) {
				s2=s2+s4.charAt(j);
			}
			if(i!=s3.length-1)
			s2=s2+" ";
		}	
		System.out.println("after revese words  :"+s2);
	}
}
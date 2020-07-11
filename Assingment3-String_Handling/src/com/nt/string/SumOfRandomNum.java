package com.nt.string;

public class SumOfRandomNum {
	
	public static int sum(int num) {
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(SumOfRandomNum.sum(4585));
	}

}

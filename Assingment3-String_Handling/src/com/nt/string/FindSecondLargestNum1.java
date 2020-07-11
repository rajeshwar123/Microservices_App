package com.nt.string;

public class FindSecondLargestNum1 {

	public static void main(String[] args) {
		int arr[] = { 54,98,45, 25, 56, 65 };
		int first = arr[0];
		int second=0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>first) {
				second=first;
				first = arr[i];
			}
			else if(arr[i]>second & arr[i]!=first) {
				second=arr[i];
			}
		}
		System.out.println(second);
		System.out.println(first);

	}
}
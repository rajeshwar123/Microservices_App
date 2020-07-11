package com.nt.string;

public class FindMinNumFromArr {

	public static void main(String[] args) {
		int arr[] = { 54,98,45, 25, 56, 98, 65 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}
}
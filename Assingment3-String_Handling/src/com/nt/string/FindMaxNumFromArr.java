package com.nt.string;

public class FindMaxNumFromArr {

	public static void main(String[] args) {
		int arr[] = { 54,98,45, 25, 56, 98, 65 };
		int max= arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}
}
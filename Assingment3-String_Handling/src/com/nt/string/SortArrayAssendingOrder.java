package com.nt.string;

import java.util.Arrays;

public class SortArrayAssendingOrder {

	public static void main(String[] args) {
		int arr[] = { 10, 54, 98, 45, 25, 56, 65, 15 };
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
		System.out.println("arr " + Arrays.toString(arr));
		System.out.println("First :"+arr[arr.length-1]);
		System.out.println("second :"+arr[arr.length-2]);
	}
}
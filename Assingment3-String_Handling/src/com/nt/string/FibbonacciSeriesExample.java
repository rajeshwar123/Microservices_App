package com.nt.string;

import java.util.ArrayList;
import java.util.List;

public class FibbonacciSeriesExample {
	public static void main(String[] args) {
		int n = 10;
		int n1 = 0, n2 = 1, sum;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(n1);
			sum= n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		System.out.println(list);
	}
}
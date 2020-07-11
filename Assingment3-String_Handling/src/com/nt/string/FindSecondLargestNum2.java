package com.nt.string;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargestNum2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(20);
		list.add(30);
		list.add(40);
		list.add(95);
		list.add(10);

		if (list.size() == 0 || list.size() == 1) {
			System.out.println("list is empty or list has only one element");
		} else {
			Integer first = list.get(0);
			Integer second = 0;
			for (int j = 0; j < list.size(); j++) {
				for (int i = j + 1; i < list.size(); i++) {
					if (list.get(i) > first) {
						second = first;
						first = list.get(i);
					}
				}
			}
			System.out.println("first :" + first);
			System.out.println("second :" + second);
		}
	}
}
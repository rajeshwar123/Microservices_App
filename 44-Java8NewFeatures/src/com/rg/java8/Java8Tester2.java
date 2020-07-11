package com.rg.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester2 {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<>();

		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		Java8Tester2 test = new Java8Tester2();
		test.sortUsingJava7(names1);
		System.out.println(names1);

		List<String> names2 = new ArrayList<>();

		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		test.sortUsingJava8(names2);
		System.out.println(names2);
	}

	public void sortUsingJava7(List<String> names1) {
		Collections.sort(names1, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

	public void sortUsingJava8(List<String> names2) {
		Collections.sort(names2, (s1, s2) -> s1.compareTo(s2));
	}
}

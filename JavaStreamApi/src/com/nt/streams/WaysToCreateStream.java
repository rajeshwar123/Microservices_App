package com.nt.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysToCreateStream {

	public static void main(String[] args) {
		Stream<Integer> st1 = Stream.of(1, 7, 8, 4, 2, 9, 7, 5, 2);
		// st.forEach(s->System.out.println(s));
		List<Integer> list = st1.filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println(list);
		/////////////////////////////////////////////
		Stream<Integer> st2 = Stream.of(new Integer[] { 2, 5, 8, 8, });
		// st2.forEach(s2->System.out.print(s2));

		String[] s = { "aanaay", "aarnv", "aabbbdv" };
		Stream st = Stream.of(s);
		System.out.println(st.distinct().collect(Collectors.toList()));
	}
}

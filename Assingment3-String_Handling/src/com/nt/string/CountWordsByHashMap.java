package com.nt.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWordsByHashMap {

	public static void main(String[] args) {
		String str = "I am Rajeshwar am I I This";
		Map<String, Integer> map = null;
		String[] s2 = str.split(" ");

		map = new HashMap<>();

		for (int i = 0; i < s2.length; i++) {
			if (map.containsKey(s2[i])) {
				int count = map.get(s2[i]);
				map.put(s2[i], count + 1);
			} else {
				map.put(s2[i], 1);
			}
		}

		Set<Entry<String, Integer>> set = map.entrySet();
		set.forEach(set1 -> {
			System.out.println(set1);
		});
	}
}
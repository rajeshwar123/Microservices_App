package com.nt.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateOccerance {

	public static void main(String[] args) {
		String str = "sfdrrrrrajeshwaerramesh";
		HashMap<Character, Integer> map = new HashMap();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
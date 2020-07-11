package com.nt.string;

import java.util.HashMap;
import java.util.HashSet;

public class CountDuplicatesInString {

	public static void main(String[] args) {
		String str="rajeshrrwar";
		HashMap<Character,Integer> map=null;
		HashSet set=null;
		set=new HashSet<>();
		map=new HashMap<>();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(set.add(str.charAt(i))!=false) {
				//map.put(str.charAt(i), count);
			}
			else {
				map.put(str.charAt(i), count+1);
			}
		}
		System.out.println(map);
	}
}

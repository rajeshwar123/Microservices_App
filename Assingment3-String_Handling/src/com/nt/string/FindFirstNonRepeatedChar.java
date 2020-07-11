package com.nt.string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstNonRepeatedChar {
	public static void main(String[] args) {
		String str1="intererjstingt";
		/*   Logic 1        */
		
		LinkedHashMap<Character,Integer> hmap=new LinkedHashMap();
		
		for(char c:str1.toCharArray()) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c, 1);
			}
		}
		
		/*for(char c:str1.toCharArray()) {
			if(hmap.get(c)==1) {
			System.out.println("This is the first no repeated character in String "+c);
			break;
			}
		}*/
		for(Entry<Character,Integer> e:hmap.entrySet()) {
			if(e.getValue()==1) {
			System.out.println("This is First non repeated character :"+e.getKey());
			break;
			}
		}      
	}
}
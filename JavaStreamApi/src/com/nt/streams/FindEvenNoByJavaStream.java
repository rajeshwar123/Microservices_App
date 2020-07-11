package com.nt.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNoByJavaStream {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(80);
		list.add(75);
		list.add(0);
		list.add(40);
		list.add(41);
		list.add(81);
		
		System.out.println(list);
		System.out.println("................");
	
		List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3=list.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println(list3);
	}
}
package com.nt.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HakerRankEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int sum=0;
		list.add(10);
		list.add(20);
		list.add(7);
		int totalEl = list.size();
		int k = 4;
		int j = 0;
			
		for (int i = 0; i < k; i++) {
			if (j == totalEl) {
				j = 1;
			}
			int s=list.get(j);
			float div = (float) s / 2;
			int roundDiv = Math.round(div);
			list.set(j, roundDiv);
			j++;
			
		}
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			sum=sum+list.get(i);
		}
		System.out.println("sum "+sum);
	}
}
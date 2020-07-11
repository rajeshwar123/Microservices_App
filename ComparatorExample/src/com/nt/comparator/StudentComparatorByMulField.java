package com.nt.comparator;

import java.util.Comparator;

import com.nt.model.Student;

public class StudentComparatorByMulField implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		//for comparison
		int byName=s1.getName().compareToIgnoreCase(s2.getName());
		int byScore=s2.getScore()-s1.getScore();
		
		
		//2 level comparison
		if(byScore==0) {
			return byName;
		}
		else {
			return byScore;
		}	
	}
}
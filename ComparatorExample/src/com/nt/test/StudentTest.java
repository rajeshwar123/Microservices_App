package com.nt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.nt.comparator.StudentComparatorByMulField;
import com.nt.comparator.StudentComparatorByName;
import com.nt.comparator.StudentComparatorByScore;
import com.nt.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> listStud=null;
		
		listStud=new ArrayList<>();
		
		listStud.add(new Student("shubham",100));
		listStud.add(new Student("roshan", 50));
		listStud.add(new Student("akash", 60));
		listStud.add(new Student("abhushan", 100));
		
		System.out.println("Unsorted Order");
		listStud.forEach(stud->{
			System.out.println(stud);
		});
		Collections.sort(listStud, new StudentComparatorByName());
		System.out.println("\nSorted Order by Name");
		listStud.forEach(stud->{
			System.out.println(stud);
		});	
		
		System.out.println("\nSorted Order by Score");
		Collections.sort(listStud, new StudentComparatorByScore());
		listStud.forEach(stud->{
			System.out.println(stud);
		});
		
		System.out.println("\nSorted Order By Score and By Name");
		Collections.sort(listStud, new StudentComparatorByMulField());
		listStud.forEach(stud->{
			System.out.println(stud);
		});
		
		
		
		
		//Array Sorted by sort() method
		Student[] a=new Student[]{new Student("akash",100),new Student("rajesh",50)};
		
		Arrays.sort(a, new StudentComparatorByName());
		System.out.println("Sorted Array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}

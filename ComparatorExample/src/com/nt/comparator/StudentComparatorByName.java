package com.nt.comparator;

import java.util.Comparator;

import com.nt.model.Student;

public class StudentComparatorByName implements Comparator<Student> {	
	@Override
	public int compare(Student s1, Student s2) {
		return s2.getName().compareToIgnoreCase(s1.getName());
	}
}
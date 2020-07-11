package com.nt.comparator;

import java.util.Comparator;

import com.nt.model.Student;

public class StudentComparatorByScore implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s2.getScore()-s1.getScore();
	}
}
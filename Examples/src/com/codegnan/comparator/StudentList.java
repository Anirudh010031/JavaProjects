package com.codegnan.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class StudentList {
	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		Student st1 = new Student(103, "Ravi",85.5);
		studentList.add(st1);
		studentList.add(new Student(101, "Anu",90.0));
		studentList.add(new Student(105, "Kiran",70.5));
		studentList.add(new Student(102, "Balu",88.0));
		
//		Collections.sort(studentList, new IdComparator());
//		Collections.sort(studentList,new NameComparator());
		Collections.sort(studentList, new MarkComparator().reversed());
		
		System.out.println(studentList);
	}

}

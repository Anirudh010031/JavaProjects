package com.codegnan.treeset;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<StudentNew> students = new TreeSet<>();
		
		students.add(new StudentNew(3,"Ravi"));
		students.add(new StudentNew(4,"Rav"));
		students.add(new StudentNew(5,"Ra"));
		students.add(new StudentNew(6,"R"));
		
		System.out.println(students);
	}
}

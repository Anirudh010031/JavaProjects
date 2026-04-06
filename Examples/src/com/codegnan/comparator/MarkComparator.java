package com.codegnan.comparator;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
	@Override
	public int compare(Student n1 ,Student n2) {
		return Double.compare(n1.marks,n2.marks);
	}
	
}

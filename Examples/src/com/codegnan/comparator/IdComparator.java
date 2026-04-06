package com.codegnan.comparator;
import java.util.Comparator;

public class IdComparator implements Comparator<Student>{
	@Override
	public int compare(Student e1,Student e2) {
		return Integer.compare(e1.id,e2.id);
	}
	

}

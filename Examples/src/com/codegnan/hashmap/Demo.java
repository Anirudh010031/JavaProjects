package com.codegnan.hashmap;
import java.util.TreeMap;


public class Demo {
	public static void main(String[] args) {
		TreeMap<Student,String> studentMap = new TreeMap<>(new IdComparator());
		studentMap.put(new Student(103,"Ravi"),"java");
		studentMap.put(new Student(104,"ANi"),"python");
		studentMap.put(new Student(105,"ripper"), "c++");
		studentMap.put(new Student(106,"RawRipper"),"Html");
		
		System.out.println(studentMap);
		
	}

}

package com.codegnan.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetOperationsDemo2 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		System.out.println(set2);
		
		
		
	}

}

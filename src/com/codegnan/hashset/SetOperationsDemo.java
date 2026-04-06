package com.codegnan.hashset;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		Set<Integer> set2 = new HashSet<>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		//HashSet (Collection c ) Union Operation using addAll();
		Set<Integer> set3 = new HashSet<>(set1);
		System.out.println(set3);
		//used to add the elements of one set to another 
		set3.addAll(set2);
		System.out.println();
		System.out.println(set3);
		//Intersection operation;
		Set<Integer> set4 = new HashSet<Integer>(set1);
		set4.retainAll(set2);     //used to retrieve the common element in both the sets mentioned
		System.out.println(set4);
	}

}

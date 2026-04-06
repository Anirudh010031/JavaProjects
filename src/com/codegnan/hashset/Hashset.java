package com.codegnan.hashset;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> fruitSet = new HashSet<String>();
		
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("kiwi");
		fruitSet.add(null);
		
		System.out.println(fruitSet);
		System.out.println();
		System.out.println("using iterator");
		Iterator<String> it = fruitSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("using enhanced for loop");
		for(String fruit:fruitSet) {
			System.out.println(fruit);
		}
	}
}

	
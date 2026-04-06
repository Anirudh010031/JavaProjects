package com.codegnan.java8enchancements;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		
	
	Predicate<String> isPresent = str-> str.contains("good");
	
	boolean result  = isPresent.test("codegnan is good");
	if(result){
		System.out.println("Yes Present");	
	}
	else {
		System.out.println("Is not Present");
	}
	
	Predicate<Integer> isEven = num -> num%2==0;
	System.out.println();
	System.out.println(isEven.test(25));
	
	Predicate<Integer> isOdd = num-> num%2!=0;
	System.out.println();
	System.out.println(isOdd.test(25));
	Predicate<String> lengthGreaterThan5 = str->(str.length()>5);
	
	
	Predicate<String> combinedPredicate = lengthGreaterThan5.and(isPresent);
	System.out.println();
	System.out.println(combinedPredicate.test("codegnan is good"));
	System.out.println();
}
}



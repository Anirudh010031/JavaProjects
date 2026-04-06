package com.codegnan.java8enchancements;

import java.util.function.Predicate;

public class PredicateDemoString {
	public static void main(String[] args) {
		
		Predicate<String> lengthGreaterThan5 = str->(str.length()>5);
		boolean result = lengthGreaterThan5.test("Anirudh");
		if(result) {
			System.out.println("Yes" + " Length is greater than 5");
		}
		else {
			System.out.println("Length is not greater than 5");
		}
		
		//String myString = "Codegnan is good";
		//myString.contains("is good");
	}

}

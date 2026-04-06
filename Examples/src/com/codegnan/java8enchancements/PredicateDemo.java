package com.codegnan.java8enchancements;
import java.util.function.Predicate;

public class PredicateDemo {
	 
	 public static void main(String[] args) {
		// boolean test(T t);
		 
		 Predicate<Integer> isPositive = (num)-> num>0 ;
		 boolean result = isPositive.test(20);
		 
		 if(result) {
			 System.out.println("Positive Number");
			 
		 }
		 else {
			 System.out.println("Negative Number");
		 }
	}

}

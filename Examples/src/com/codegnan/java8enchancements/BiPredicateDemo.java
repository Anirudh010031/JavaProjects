package com.codegnan.java8enchancements;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		

	       // take two strings and  check whether
	       // the first character of both strings are same or not.
	
	       BiPredicate<String,String>  firstCharEquals = (str1,str2)->{
	    	   char char1 = str1.charAt(0);
	    	   char char2 = str2.charAt(0);
	    	   
	    	   return char1 == char2;
	       };
	      String str1 = "Apple";
	      String str2 = "Apricot";
	      String str3 = "Banana";
	      
	      System.out.println(firstCharEquals.test(str1, str3));
	      System.out.println(firstCharEquals.test(str1, str2));
	       
}
}

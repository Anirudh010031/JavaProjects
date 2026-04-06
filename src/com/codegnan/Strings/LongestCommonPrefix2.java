package com.codegnan.Strings;

public class LongestCommonPrefix2 {
	public static void main(String[] args) {

	    String arr[] = {"denote","denoted","denoting","denotation"};

	    // find smallest word
	    String smallest = arr[0];

	    for(int i = 1; i < arr.length; i++) {
	        if(arr[i].length() < smallest.length()) {
	            smallest = arr[i];
	        }
	    }

	    String prefix = "";

	    for(int i = 0; i < smallest.length(); i++) {

	        char current = smallest.charAt(i);

	        for(int j = 0; j < arr.length; j++) {

	            if(arr[j].charAt(i) != current) {
	                System.out.println("Longest Common Prefix: " + prefix);
	                return;
	            }
	        }
 
	        prefix = prefix + current;
	    }

	    System.out.println("Longest Common Prefix: " + prefix);
	}
}

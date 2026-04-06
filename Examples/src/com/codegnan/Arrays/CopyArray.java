package com.codegnan.Arrays;

import java.util.Arrays;

public class CopyArray {
	 public static void main(String[] args) {
		
		  int [] original = {1,2,3,4};
		  int [] copy = Arrays.copyOf(original, original.length);
		  
		  System.out.println("Original Array : "+Arrays.toString(original));
		  System.out.println("Copied Array : " +Arrays.toString(copy));
	}

}

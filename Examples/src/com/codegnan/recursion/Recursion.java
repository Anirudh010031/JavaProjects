package com.codegnan.recursion;

public class Recursion {
	public static int factRecursive(int n) {
		if(n<=1) {
			return 1;
		}
		else 
			return n*factRecursive(n-1);
		}
public static void main(String[] args) {
	System.out.println(factRecursive(5));

		
}
}

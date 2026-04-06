package com.codegnan.recursion;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str) {
		// Base Condition  
		if(str.isEmpty()) {
			return str;
		}
		//recursive call
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String result = reverse(input);
		System.out.println("Reversed String :" +result);
		sc.close();
	}

}

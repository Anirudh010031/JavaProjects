package com.codegnan.Strings;

public class Palindrome {
	public static void main(String[] args) {
		String n = "abcdcba";
		int left = 0 ;
		int right = n.length()-1;
		while(left<right) {
			if(n.charAt(left)!=n.charAt(right)) {
				System.out.println("not a Palindrome");
				return;
			}
			else
			{
				left++;
				right--;
			}
		}
		System.out.println("is a palindrome");
	}

}

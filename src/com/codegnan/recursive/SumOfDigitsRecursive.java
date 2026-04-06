package com.codegnan.recursive;

public class SumOfDigitsRecursive {
	public static int Sum(int n) {
		if(n<=1) {
			return n;
		}
		return n%10+Sum(n/10);
	}
public static void main(String[] args) {
	System.out.println(Sum(521));
}
}

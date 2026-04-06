package com.codegnan.Arrays;

public class PracticeArray {
	
	public static int Adder(int a[]) {
		
		return a[0]+a[1]+a[2]+a[3];
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int result = Adder(a);
		System.out.println(result);
		
	}

}

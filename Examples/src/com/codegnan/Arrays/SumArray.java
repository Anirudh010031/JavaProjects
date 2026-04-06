package com.codegnan.Arrays;

public class SumArray {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		int sum = 0;
		
		for(int nums: a) {
			sum+=nums;
			
		}
		System.out.println("Sum of Elements: "+sum);
	}

}

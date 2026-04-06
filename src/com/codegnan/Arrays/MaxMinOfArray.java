package com.codegnan.Arrays;

public class MaxMinOfArray {

	 public static void main(String[] args) {
		 
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		int max = a[0];
		
		int min = a[0];
		
		for(int nums:a) {
			if(nums>max) {
				max = nums;
			}
			if(nums<min) {
				min = nums;
			}
		}
		
		System.out.println("Minimum value :" +min);
		System.out.println("Maximum Value :" +max);
	 }
}

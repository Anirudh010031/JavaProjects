package com.codegnan.Arrays;

import java.util.Arrays;

public class SearchArray {
	public static void main(String[] args) {
		int[] nums = {4,5,7,9,10};
		 int index = Arrays.binarySearch(nums, 4);
		 
		 System.out.println("index of element : "+index);
	}

}

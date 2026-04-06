package com.codegnan.Arrays;

import java.util.Arrays;

public class FillArray {
public static void main(String[] args) {
	int[] nums = new int[5];
	Arrays.fill(nums,10);
	
	System.out.println("Filled Array :" +Arrays.toString(nums));
}
}

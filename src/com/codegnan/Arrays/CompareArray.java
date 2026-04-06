package com.codegnan.Arrays;
import java.util.Arrays;

public class CompareArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		
		boolean isEqual = Arrays.equals(a,b);
		
		System.out.println("Arrays are Equal :" +isEqual);
		
	}

}

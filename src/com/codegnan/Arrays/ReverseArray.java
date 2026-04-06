package com.codegnan.Arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = {1,3,4,5,8,0};
		
		//reverse the array
		for(int i = 0;i<a.length/2;i++) {
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
			
		}
		
		System.out.println("Reversed array: " +Arrays.toString(a));
		
	}

}

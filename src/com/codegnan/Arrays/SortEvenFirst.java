package com.codegnan.Arrays;

public class SortEvenFirst {
	public static void main(String[] args) {
		int arr[] = {12,23,34,54,39,65};
		for (int i =0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]%2>arr[j+1]%2) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Even numbers First:");
		for(int x :arr) {
			System.out.println(x+ " ");
		}
		
	}

}

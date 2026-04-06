package com.codegnan.Arrays;

public class MaxSmallestSubArray {
	    public static void main(String[] args) {
	        int arr[] = {2,-1,3,-2,4};

	        int maxSum = arr[0];
	        int currentSum = arr[0];
	        int size = 1;
	        int minSize = 1;

	        for(int i = 1; i < arr.length; i++) {

	            if(arr[i] > currentSum + arr[i]) {
	                currentSum = arr[i];
	                size = 1;
	            } else {
	                currentSum = currentSum + arr[i];
	                size++;
	            }

	            if(currentSum > maxSum) {
	                maxSum = currentSum;
	                minSize = size;
	            }
	        }

	        System.out.println("Maximum Sum = " + maxSum);
	        System.out.println("Smallest Size = " + minSize);
	    }
	}

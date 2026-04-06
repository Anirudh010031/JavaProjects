package com.codegnan.Arrays;

public class SortLength {
               public static void main(String[] args) {
            	   String[] arr = {"apple","Kiwi","Banana"};
            	   System.out.println("Before Sorting:");
            	   printArray(arr);
            	   for(int i=0;i<arr.length-1;i++) {
            		   for(int j=0;j<arr.length-1-i;j++) {
            			   if(arr[j].length()>arr[j+1].length()) {
            				   String temp = arr[j];
            				   arr[j]=arr[j+1];
            				   arr[j+1]=temp;
            				
            			   }
            		   }
            	   }
            	   System.out.println("\nAfter Sorting by Length:");
            	   printArray(arr);
               }
               public static void printArray(String[] arr) {
            	   for(String s:arr) {
            		   System.out.println(s+"");
            	   }
               }
}

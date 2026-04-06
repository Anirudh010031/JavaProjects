package com.codegnan.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Demo Application");
		Scanner scanner = new Scanner(System.in);
		int[] marksArray = new int[3];  //creation of array 
		// to store the marks of the student
		studentMarks(scanner,marksArray);
		//to display the marks of the students
		//marksArray[0] = 60;
		//marksArray[1] = 89; //array declaration 
		//marksArray[2] = 77;
		 
		displayMarks(marksArray);// calling displayMethod 
		//displayMarks("some string");
		//System.out.println(marksArray.length);//size of the array
		//for(int i=0;i<marksArray.length;i++) {
			//System.out.println(marksArray[i]);
		//}
	}
	public static void displayMarks(int[] marksArray) {
	  System.out.println("Displaying the Marks");
	  for(int marks:marksArray) {
		  System.out.println(marks);
		  
	  }
	}
	//public static void displayMarks(String str) {
		//System.out.println("Displaying the Marks");
	//}
	public static void studentMarks(Scanner scanner, int[] marksArray) {

		     for(int i=0; i<marksArray.length; i++) {
		    	 
	          System.out.println("please enter mark"+(i+1)+":");
		    	 marksArray[i] = scanner.nextInt();
		     }
}
}


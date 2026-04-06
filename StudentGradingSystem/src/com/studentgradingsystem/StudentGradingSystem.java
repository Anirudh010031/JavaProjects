package com.studentgradingsystem;
import java.util.Scanner;

	public class StudentGradingSystem {
	    
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter number of Students:");
	        int totalStudents = scanner.nextInt();
//	        scanner.nextLine()
	        
	        System.out.println("Enter number of Subjects:");
	        int totalSubjects = scanner.nextInt();
	      scanner.nextLine(); 
	        
	        String[] studentNames = new String[totalStudents];
	        int[] totalMarks = new int[totalStudents];
	        float[] percentages = new float[totalStudents];
	        char[] grades = new char[totalStudents];
	        
	        storeStudentDetails(scanner, studentNames, totalMarks, totalSubjects);
	        calculatePercentage(totalMarks, percentages, totalSubjects);
	        declareGrades(percentages, grades);
	        displayResults(studentNames, totalMarks, percentages, grades);
	        
	        scanner.close();
	    }
	    
	    
	    public static void storeStudentDetails(Scanner scanner, 
	                                           String[] studentNames, 
	                                           int[] totalMarks, 
	                                           int totalSubjects) {
	        
	        for(int i = 0; i < studentNames.length; i++) {
	            
	            System.out.println("\nStudent " + (i+1));
	            
	            System.out.println("Enter Name:");
	            studentNames[i] = scanner.nextLine();
	            
	            int sum = 0;
	            
	            for(int j = 0; j < totalSubjects; j++) {
	                System.out.println("Enter marks for Subject " + (j+1) + ":");
	                int mark = scanner.nextInt();
	                sum += mark;
	            }
	            
	            scanner.nextLine(); 
	            totalMarks[i] = sum;
	        }
	    }
	    
	    
	    public static void calculatePercentage(int[] totalMarks, 
	                                           float[] percentages, 
	                                           int totalSubjects) {
	        
	        for(int i = 0; i < totalMarks.length; i++) {
	            percentages[i] = (int) (totalMarks[i] / totalSubjects);
	        }
	    }
	    
	    
	    public static void declareGrades(float[] percentages, char[] grades) {
	        
	        for(int i = 0; i < percentages.length; i++) {
	            
	            if(percentages[i] >= 90)
	                grades[i] = 'A';
	            else if(percentages[i] >= 75)
	                grades[i] = 'B';
	            else if(percentages[i] >= 60)
	                grades[i] = 'C';
	            else if(percentages[i] >= 50)
	                grades[i] = 'D';
	            else
	                grades[i] = 'F';
	        }
	    }
	    
	    
	    public static void displayResults(String[] studentNames,int[] totalMarks ,float[] percentages,char[] grades) {
	        
	        System.out.println("\n==============FINAL REPORT==============");
	        
	        for(int i = 0; i < studentNames.length; i++) {
	        	System.out.println("-------------------------------------------------------");
	            System.out.println("\nName: " + studentNames[i]);
	            System.out.println("Total Marks: " + totalMarks[i]);
	            System.out.println("Percentage: " + percentages[i]);
	            System.out.println("Grade: " + grades[i]);
	            System.out.println("-------------------------------------------------------");
	        }
	    }
	}
	
	   

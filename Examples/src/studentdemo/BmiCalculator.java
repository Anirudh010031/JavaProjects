package studentdemo;

import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter Weight in kgs : ");
		  double weight = scanner.nextDouble();
		  
		  System.out.println("Enter height in mts :");
		  double height = scanner.nextDouble();
		   
		  double bmi = weight/(height*height) ;
		  System.out.println("Your BMI: "+bmi );
		  scanner.close();
	}

}

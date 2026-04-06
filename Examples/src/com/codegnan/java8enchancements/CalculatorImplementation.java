package com.codegnan.java8enchancements;

//public class CalculatorImplementation implements Calculator{
//	
//	
//	public int calculate(int a, int b) {
//		return a+b;
//	}

// Using Lambda Expression

public class CalculatorImplementation{
	
	public static void main(String[] args) {
		
//		Runnable run = ()->{};
		Calculator c = (var1,var2)->var1+var2;
		Calculator product = (x,y)->x*y;
		Calculator substract = (a,b)->a-b;
		Calculator quotient = (a,b)->{ return a/b;};
		
		System.out.println(c.calculate(90, 10));
		System.out.println(product.calculate(13, 15));
		System.out.println(substract.calculate(9, 2));
		System.out.println(quotient.calculate(50, 10));
	}
}

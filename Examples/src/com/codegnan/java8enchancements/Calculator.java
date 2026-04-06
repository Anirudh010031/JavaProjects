package com.codegnan.java8enchancements;

public interface Calculator {
	
	int calculate (int a, int b);
	
	default void showOperation() {
		System.out.println("Operation started");
	}
	

}

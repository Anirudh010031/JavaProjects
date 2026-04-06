package com.codegnan.demointerface;

@FunctionalInterface
interface MyInterface {
	
	void display();
	
	
	//any number of default and static methods
	
	default void myMethod() {
		System.out.println("Default Method");
	}
  
	static void staticMethod() {
		System.out.println("This is staticMethod:");
	}
}

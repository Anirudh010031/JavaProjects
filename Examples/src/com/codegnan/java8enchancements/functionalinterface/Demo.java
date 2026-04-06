package com.codegnan.java8enchancements.functionalinterface;

public class Demo {

	void greet(String name) {
		System.out.println(name+"Have a good Day");
	}
	
	static void greetPerson(String name) {
		System.out.println(name+" Have a good Day");
	}
	public static void main(String[] args) {
		Greeting myGreeting =(n)->System.out.println(" "+n+"!Hello");
		
		myGreeting.sayHello("Raj");
		
		//another way of writing a lambda expression
		// if functional interface abstarct method return type and arguments are of same,
		// we can use the method references using same name
		
		Demo demo = new Demo();
		
		Greeting myGreeting1 = demo::greet;
		myGreeting1.sayHello("SlitSlicer");
		
		// also use method reference for static methods too
		
		Greeting myGreeting2 = Demo::greetPerson;
		myGreeting2.sayHello("Raw Ripper");
	}
}

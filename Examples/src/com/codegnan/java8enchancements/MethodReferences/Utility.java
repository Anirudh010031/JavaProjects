package com.codegnan.java8enchancements.MethodReferences;

//Write 

import java.util.function.Consumer;

public class Utility {
	
	public static void sayHello(String name) {
		System.out.println("Hello , " +name+ "!");
	}
	
	void change(String text) {
		System.out.println(text.toUpperCase());
	}
	

public static void main(String[] args) {
	
	Utility utility = new Utility();
	Consumer<String> ref1 = utility::change;
	ref1.accept("Ripper");
	
	Consumer<String> ref = Utility::sayHello;
	ref.accept("Ripper");
	
	
}
}
package com.codegnan.java8enchancements.ConstructorReferences;

public class Student {
	
	String name;
	Student (String name){
		this.name = name;
	}
	void display() {
		System.out.println("Name :"+name);
	}
	
	public static void main(String[] args) {
		
		StudentFactory fact = name-> new Student(name);
		Student s1 = fact.create("Anirudh");
		s1.display();
		
		StudentFactory fact1  = Student::new;
		Student s2 = fact1.create("RawRipper");
		s2.display();
		
		
	}

}

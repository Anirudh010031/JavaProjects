package com.codegnan.java8enchancements;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StudentConsumer {
	public static void main(String[] args) {
		Student student = new Student("Akash",70);
		
		Consumer<Student> addBonusMarks = s->s.setMarks(s.getMarks()+10);
		System.out.println("Before adding Bonus:"+student.getMarks());
		
		addBonusMarks.accept(student);
		System.out.println("After adding Bonus:"+student.getMarks());
		
		BiConsumer<String,Integer> updateDetails = 
				 (newName,newMarks)->{ student.setName(newName);
				                       student.setMarks(newMarks);
				 };
		
				 updateDetails.accept("Ripper",96);
				 
				 System.out.println(student);
				 
	}

}

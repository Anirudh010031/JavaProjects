package com.codegnan.threadsdemo;

public class Demo {
	 
	 public static void main(String[] args) {
		 Animal a = ()->{System.out.println("bark");};
		 a.makeSound();
	 }

}

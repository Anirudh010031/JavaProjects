package com.codegnan.java8enchancements;

@FunctionalInterface
interface FunctionalInterface1 {
	
	public void abstractMethod();
	
	default void defaultMethod() {
		System.out.println("Default Method body");
	}
	
	default void defaultMethod1() {
		System.out.println("Default Method body");
	}

	public static void staticMethod() {
		System.out.println("Static Method Body");
	}
	

}

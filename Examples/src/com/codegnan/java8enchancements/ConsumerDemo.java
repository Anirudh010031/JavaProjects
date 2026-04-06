package com.codegnan.java8enchancements;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> printMessage = x-> System.out.println(x);
		printMessage.accept("Ripper");
		
	}

}

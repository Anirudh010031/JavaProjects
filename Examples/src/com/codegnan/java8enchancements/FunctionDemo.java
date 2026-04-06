package com.codegnan.java8enchancements;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String,Integer> stringLengthFunction = str->str.length();
		
		System.out.println(stringLengthFunction.apply("Codegnan"));
		
		//converting the string into upper case elements
		Function<String,String> stringUpperCase = str1->str1.toUpperCase();
		System.out.println(stringUpperCase.apply("uhaa"));
		
		//change of datatypes
		Function<Integer,Integer> multiplyBy2 = num->num*2;
		System.out.println(multiplyBy2.apply(24));
		
		Function<Integer,Integer> addNum10 = num->num+10;
		System.out.println(addNum10.apply(23));
		
		//combining two functions by using *andThen operator
		
		Function<Integer,Integer> combinedFunction = multiplyBy2.andThen(addNum10);
		System.out.println(combinedFunction.apply(30));
		
		
		//compose - opposite to addThen operator i.e; last statement executes first
		//and first statement executes at the last.
		
		Function<Integer,Integer> composeFunction = multiplyBy2.compose(addNum10);
		System.out.println(composeFunction.apply(20));
	}

}

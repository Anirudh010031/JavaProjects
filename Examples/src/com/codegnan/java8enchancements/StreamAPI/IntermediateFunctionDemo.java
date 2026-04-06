package com.codegnan.java8enchancements.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class IntermediateFunctionDemo {
	
	public static void main(String[] args) {
		
		//filter()- selects the elements based on a condition
		
		List<Integer> numbers = Arrays.asList(10,10,15,25,50);
		//numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		// this doesnt store the data in the list
		List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		// map : map() is used to transform each element
		
		List<String> namesList = Arrays.asList("ani","RawRipper","Hookeitup","slitslicer");
		List<String> transformedNamesList = namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(transformedNamesList);
		
		// sorted() is used to sort the elements of a collection
		
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		// reverse sorted list
		List<Integer> reverseSortedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			System.out.println(reverseSortedList);
			
			// distinct - removes duplicate elements
			List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
			System.out.println(uniqueNumbers);
			
			//limit - restricts the number of elements
			List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
			System.out.println(limited);
			
			List <Integer> result = numbers.stream().filter(n->n%2==0).distinct().map(n->n*10).sorted().collect(Collectors.toList());
			System.out.println(result);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}

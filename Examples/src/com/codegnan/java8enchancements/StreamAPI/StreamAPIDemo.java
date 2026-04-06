package com.codegnan.java8enchancements.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		
		//Step1 : create a collection
		List<Integer> numberList = Arrays.asList(20,10,24,13);
		
		//create a stream object by using stream()
		//numberList.stream();
		numberList.stream().filter(n->( n+1)%2==0).forEach(n->System.out.println(n));
		
		System.out.println();
		List<String> namesList = Arrays.asList("Anirudh","aniRuthless","Raw","RawRipper");
//				List<String> filteredNames = namesList.stream().filter(s->s.length()>3).collect(Collectors.toList());
				namesList.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		
	}

}

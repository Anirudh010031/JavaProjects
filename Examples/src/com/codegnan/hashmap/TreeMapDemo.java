package com.codegnan.hashmap;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map.Entry;

public class TreeMapDemo {
public static void main(String[] args) {
		
		TreeMap<Integer,String> students = new TreeMap<>(Collections.reverseOrder());
		
		students.put(101,"ani");           //Entry
		students.put(102,"ripper");        //Entry
		students.put(103, "raw");          //Entry
		students.put(107, "raw ripper");   //Entry
		students.put(105, "baby");
		
		System.out.println(students);
		
		System.out.println(students.get(101));
		
		System.out.println(students.keySet());
		
		//keySet() retrieves the keys in a map.
		
		for(Integer key:students.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(students.values());
		
		//values() retrives the values in a map.
		for(String value:students.values()) {
			System.out.println(value);
		}
		
		//Print key-value pairs using entrySet() method.
		System.out.println(students.entrySet());
		
		for(Entry<Integer,String> entry :students.entrySet() ){
			System.out.println(entry);
			
		}
	}

}

package com.codegnan.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingHashMap {
	public static void main(String[] args) {
		String  s = "supercalifragilisticexpialidocious" ;//string values
		s = s.toLowerCase();
		
		//create map object
		Map<Character,Integer> map=new HashMap<>();//empty object created
		for(char ch:s.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch,0)+1);
			
		}
		//printing all the key and values
		int maxFreq = 0;
		char highestChar = 'z';
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			char ch = entry.getKey();
			int freq = entry.getValue();
			//higher frequency found
			if(freq>maxFreq) {
				maxFreq=freq;
				highestChar=ch;
			}
		}
		// output
		System.out.println("Highest Frequency Character:"+highestChar);
		System.out.println("Frequency:"+maxFreq);
	}

}

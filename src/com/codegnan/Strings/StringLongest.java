package com.codegnan.Strings;

import java.util.Arrays;

public class StringLongest {
	public static String Long(int nums[]) {
		//convert integer array to string
		String str[] = new String[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			str[i]=String.valueOf(nums[i]);
	
		}
		//sorted:concated with sorted :desc
		Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
		//edge case
		if(str[0].equals("0")){
			return "0";
	
		}
		//appending the data
		StringBuilder sb = new StringBuilder();
		for(String s:str) {
			sb.append(s);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int nums[] = {3,30,34,5,9};
		 String result = Long(nums);
	    System.out.println("Largest number formed: " + result);
		
	}

}

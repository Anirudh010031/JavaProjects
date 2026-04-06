package com.codegnan.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kiwi");
		list.add("date");
		list.add("banana");
		list.add("apple");
		list.add("pineapple");
		for(int i = 0;i<list.size();i++) {
			for(int j = i+1 ; j<list.size();j++)
			{
				String s1 = list.get(i);
				String s2 = list.get(j);
				if(s1.length()>s2.length()|| s1.length()==s2.length() && s1.compareTo(s2)>0) {
					Collections.swap(list, i, j);
					
				}
			}
		}
		System.out.println(list);
	}

}

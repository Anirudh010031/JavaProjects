package com.codegnan.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo{
	public static void main(String[] args) {
		 HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		 hm.put(103,24);
		 hm.put(101,12);
		 hm.put(104,67);
//		 hm.put("areyy",999);
//		 hm.put("Anirudh",898);
//		 hm.put("jai",100);
//		 hm.put("areyy",538);
		 System.out.println(hm.get(101));
		 System.out.println(hm.get(103));
		 System.out.println(hm.getOrDefault(111, 0));
		 System.out.println(hm.containsKey(155));
// by using iterator(keyset(),entryset())
		 Set<Entry<Integer,Integer>>  result=hm.entrySet();
			Iterator<Entry<Integer,Integer>> itr=result.iterator();
			while(itr.hasNext()) {
				Entry<Integer,Integer> FinalResult=itr.next();
				System.out.println(FinalResult.getKey()+" "+FinalResult.getValue());
			}
			}

	
	}



package com.codegnan.Strings;

//public class LongestPrefix {
//	public static void main(String[] args) {
//		String Long[] = {"dettol","detoriorate","detonation","detonator"};
//		//we have to consider one of the word in the given string as a initial prefix to compare it with the remaining words of the string
//		String prefix = Long[0];
//		// now as we have considered the first element as the prefix we have to check it with succeding words not again with the existing word 
//		for (int i =1;i<Long.length;i++)
//		{
//			//we have to continue the comparison with every word 
//			// and have to delete the uncommon characters in remaining words 
//			while(Long[i].indexOf(prefix)!=0) {
//				prefix = prefix.substring(0,prefix.length()-1);
//			}
//		}
//		System.out.println("Longest Common Prefix:"+prefix);
//	}
//
//}

    /*public static void main(String[] args) {

    	String Long[] = {"dettol","din","detonation","detonator"};
        System.out.println(Long.length);
        
        
        //let us consider an empty string
        String prefix = " "; //to add the common character to this empty String

        for(int i = 0; i < Long[0].length(); i++) { // now we consider the first word

            char current = Long[0].charAt(i); //will assign the first character of the 1st string to a varible for comparision

            for(int j = 1; j < Long.length; j++) { //now this will start comparing the next word letters with the preceeding word 

                if(i >= Long[j].length() || Long[j].charAt(i) != current) {
                    System.out.println("Longest Common Prefix: " + prefix);
                    return;
                }

            }

            prefix = prefix + current;
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }*/
	public class LongestCommonPrefix{

	public static void main(String[] args) {

        String arr[] = {"denote","denoted","denoting"," denotion"};

        // to find the smallest word 
        String smallest = arr[0];

        for(int k = 1; k < arr.length; k++) {
            if(arr[k].length() < smallest.length())
            {
                smallest = arr[k];
            }
        }

        String prefix ="";

        // Step 2: Compare characters using smallest word
        for(int i = 0; i <smallest.length(); i++) {

            char current = smallest.charAt(i);

            for(int j = 0; j <arr.length; j++) {

                if(arr[j].charAt(i) != current) 
                {
                    System.out.println("Longest Common Prefix: " + prefix);
                    return;
                }
               
            }
            prefix = prefix + current;

        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}

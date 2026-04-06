package com.codegnan.Arrays;

public class AnagramCheck2 {

	    public static void main(String[] args) {

	        String str1 = "listen";
	        String str2 = "silent";

	        // convert to lowercase
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        // if lengths are not equal → not anagram
	        if(str1.length() != str2.length()) {
	            System.out.println("Not Anagram");
	            return;
	        }

	        int count[] = new int[26]; // for a-z

	        // increase count for first word
	        for(int i = 0; i < str1.length(); i++) {
	            count[str1.charAt(i) - 'a']++;
	        }

	        // decrease count for second word
	        for(int i = 0; i < str2.length(); i++) {
	            count[str2.charAt(i) - 'a']--;
	        }

	        // check if all counts are zero
	        for(int i = 0; i < 26; i++) {
	            if(count[i] != 0) {
	                System.out.println("Not Anagram");
	                return;
	            }
	        }

	        System.out.println("Anagram");
	    }
	}


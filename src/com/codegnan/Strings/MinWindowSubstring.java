package com.codegnan.Strings;

public class MinWindowSubstring {
   
    public static String minWindow(String s, String t) {
        int[] freq = new int[256];

        // add the elements to the array
        
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0; int count = t.length();
        int minLen = -1; int start = 0;

         while (right < s.length()) {
            char rChar = s.charAt(right);

            // if the character present is needed
            
            if (freq[rChar] > 0) {
                count--;
            }
            freq[rChar]--;

            right++;

            // When all characters are matched
            
            while (count == 0) {

                // rescaling the minimum window
            	if (minLen == -1 || right - left < minLen) {
            	    minLen = right - left;
            	    start = left;
            	}

                char lChar = s.charAt(left);

                freq[lChar]++;

                if (freq[lChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLen == -1) {
            return "";
        } else {
            return s.substring(start, start + minLen);
        }
    }
    
    public static void main(String[] args) {
        String s = "aebdecbcba";
        String t = "abc";

        System.out.println(minWindow(s, t));
    }
}

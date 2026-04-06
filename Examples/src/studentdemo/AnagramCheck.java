package studentdemo;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
//    String An1 = "silent";
//	String An2 = "listen";                               PROFFESSIONAL WAY OF EXECUTING THE PROGRAM
//	System.out.println(AnagramCheck.isAnagram(An1, An2));
//	}
//public static boolean isAnagram(String An1,String An2) {
//	if(An1.length()!=An2.length()) {
//		return false;
//	}
//	//creating array of boxes
//	int arr[] = new int[26];
//	for(int i =0;i<An1.length();i++) {
//		arr[An1.charAt(i)-'a']++;
//		arr[An2.charAt(i)-'a']--;
//	}
//	for(int count:arr)
//	{
//		if(count!=0) {
//			return false;
//		}
//	}
//	 return true;
//	 ===================== SHORTCUT TO THE PROGRAM ============================
//}
		String st1 = "Panama";
		String st2 = "aPnmaa";
		//remove spaces and punctuation, convert to lowercase
		st1 = st1.replaceAll("[^a-zA-z]","").toLowerCase();
		st2 = st2.replaceAll("[^a-zA-z]","").toLowerCase();
	    //convert char to array
		char[] arr1 = st1.toCharArray();
		char[] arr2 = st2.toCharArray();
		//sort arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//check equality 
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not an Anagram");
		}
		
		
}
}


	  


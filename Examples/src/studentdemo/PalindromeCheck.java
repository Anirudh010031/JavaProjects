package studentdemo;

public class PalindromeCheck {
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "madam";
		System.out.println(PalindromeCheck.isPalindrome(s));
	}

}

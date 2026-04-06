package studentdemo;

public class PalindromeCheck2 {
	public static void main(String[] args) {
		String s = "A man, a plan,a canal: Panama";
		s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
		int left = 0;
		int right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
			System.out.println("is not a palindrome");
			return;
			}
			else
			{
				left++;
				right--;
			}
		}
		System.out.println("is a palindrome");
	}

}

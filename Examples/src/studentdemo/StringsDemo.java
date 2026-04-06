package studentdemo;

public class StringsDemo {
	public static void main(String[] args) {
		
	String name = "Annimalla";
	String name1 = "Anirudh";
	String name2 = "RAw";
	String name3 = "Ripper";
	System.out.println(name.charAt(2));
	System.out.println(name1.length());
	System.out.println(name2.codePointAt(1));
	System.out.println(name3.codePointBefore(2));
	System.out.println(name3.codePointCount(1,3));
	System.out.println(name2.compareTo(name3));
	
	

}
}

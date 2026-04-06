package studentdemo;

public class StringBufDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("capgemini");
		StringBuilder sb1 = new StringBuilder("anirudh");
//		System.out.println(sb);
//		sb.append("inindia");
//		System.out.println(sb);
		System.out.println(sb.equals(sb1)); // this is form object class
		System.out.println(sb==sb1);
		System.out.println(sb.compareTo(sb1));
		System.out.println();
	}

}
 
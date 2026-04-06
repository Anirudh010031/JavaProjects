package com.codegnan.fibannoci;

public class FibanocciRecursive {
	public static int fiba(int n) {
		if(n<=1) {
			return 1;
		}
	 return fiba(n-1)+fiba(n-2);
	}
	public static void main(String[] args) {
		int n=50;
		for(int i=0;i<=n;i++) {
			System.out.println(fiba(i)+ " ");
		}
	}
}
		
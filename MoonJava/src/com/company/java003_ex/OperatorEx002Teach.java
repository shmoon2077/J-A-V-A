package com.compnay.java003_ex;

public class OperatorEx002Teach {
	public static void main (String [] args) {
		int x=5;
		System.out.println("1: "+ ( x>3 && x<10 ));
		char ch = '\u0000';
		ch = 'a';
		System.out.println("2: "+ ( ch=='a' || ch=='A' ) );
		System.out.println("3: "+ ( ch>='0' && ch<='9'));
	}
}

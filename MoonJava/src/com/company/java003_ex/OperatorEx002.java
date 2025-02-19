package com.compnay.java003_ex;

import java.util.Scanner;

public class OperatorEx002 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		int num1=5;
		System.out.println(num1>3 && num1<10);
		
		char ch;
		ch = scanner.next().charAt(0);		
		System.out.println(ch=='a'|| ch=='A'); 
		ch = scanner.next().charAt(0);
		System.out.println( (int)ch>=0 && (int)ch<=9 );
		ch = scanner.next().charAt(0);
		System.out.println( ch>=(char)65 && ch<=(char)122);

		scanner.close();
		
	}
}

package com.company.java003;

import java.util.Scanner;

public class Casting002 {
	public static void main (String [] args) {
		//#1. 문자 초기화
		char ch1 = ' ';
		char ch2 = '\u0000';
		System.out.println("step1 : "+ ch1 + "\t" +ch2);		
		System.out.println("step2 : "+(int)+ch1 + "\t" +(int)ch2);

		//#2. 문의 연산
		char c = 'A';
		System.out.println("step3 : "+c+"\t"+(int)c);
		
		System.out.println("step4 : "+(c+1)); // 66
		System.out.println("step5 : "+(char)(c+1)); // 66
		
		
		
		//Q. 대문자 'A'를 소문자 'a'로 변환 시키기
		char a = 'a';
		char bigA = 'A';
		System.out.println((int)a);
		System.out.println((int)bigA);
		System.out.println((char)('A'+32));
		
		char q1 = 'A';
		System.out.println(q1+=32);
		
		
		//#3. 문자열
		String str1 = "abc";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(str1);
		System.out.println(scanner);
		
		System.out.println(str1.charAt(0)); //a 
		System.out.println(str1.charAt(1)); //b
		System.out.println(str1.charAt(2)); //c
		
		// char ch = scanner.nextChar(); // 실행 불가
		
		String str = scanner.next();
		System.out.println("입력한 문자열 : " + str);
		
		char ch = scanner.next().charAt(0);
		System.out.println("입력한 문자 : " + ch);
		
		
		//Q2. 대문자 입력 받아서 소문자로 변경하는 프로그램
		
	}

}

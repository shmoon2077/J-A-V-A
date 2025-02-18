package com.company.java002;

public class Var001 {
	public static void main(String[] args) {
		// 자료형 변수형
		int a = 0;  // a [0]
		
		System.out.println("1 :"+ a );
		
		a = 100000; // a [100000]
		System.out.println("2 :"+ a );
		
		a = 100000 - 11000; // a [89000]
		System.out.println("3 :"+ a);
		
		a = a - 3000; 
		System.out.println("4 :"+ a);
		
		
		// 2. 변수의 범위      여기부터{ ~~~~ }까지
		{ int b=20; System.out.println(b); }
		// 중괄호 밖에서 변수 설정 불가능
		
		// 3. 변수명  $_abc7
		int $1=1; int _2=2; int a3bc=3;
//		int static; (X)
		System.out.println ($1 + "\t" + _2 + "\t" + a3bc);
	}
}

package com.company.java003;

import java.util.Scanner;

public class Operator001 {
	public static void main (String [] args) {
		// 먼저() 값(+,-,*,/,%,++,--)을 구하고 비교(>,<,>=,<=,==,!=) 조건 ( &&, || ,?: ) 대입 (=) 
		
		// 1. 값 (+,-,*,/,%,++,--)
		int a=10, b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫 연산자
		System.out.println(a%b); // 나머지 
		
		
		// 나머지 연산자(%) 
		//Q1.- 짝수? 홀수?
		System.out.println( 0%2 + " " + 1%2 + " " + 2%2 + " " + 3%2 );
		//  Q2. 3의 배수?
		//  %3을 했을 때 0이 되는 값
		System.out.println( 0%3 + " " + 1%3 + " " + 2%3 + " " + 3%3 );

		
		
		// 2. 비교 ( == , != , < , > , >= , <=)
		// 3의 배수? true / false
		
		System.out.println(10>3); // true or false
		System.out.println(10<3);
		System.out.println(a%2==0);  //짝수
		System.out.println(a%2==1);  //홀수
		
		
		// 3. 조건 ( &, &&(모든 조건 만족시),  |,  ||(여러 조건 중 하나 만족시)
		System.out.println( true & true );
		System.out.println( true && true );  
		System.out.println( false & true );  // & 하나 붙일 경우 처음에 false여도 뒤 코드도 읽는다.
		System.out.println( false && true ); // && 처음에 false면 뒤에 코드는 읽지 않는다. dead code
		
		System.out.println( true | true );
		System.out.println( true || true ); // 어느 하나만 맞으면 되기 때문에 뒤가 dead code
		System.out.println( false | true );  
		System.out.println( false || true ); 
		
		//4. :? 삼항연산자  (조건)? 참:거짓
		System.out.println( (a>b)? "a>b":"a<b" );
		System.out.println( (3%2==0)? "짝수":"홀수" );
		
		//q1) 2의 배수이면서 5의 배수라면 true / false
		System.out.println((a%2==0)&&(a%5==2));
		System.out.println((a%2==0)||(a%3==3));
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		if (num1>0) {System.out.println("양수");}
		else if (num1<0) {System.out.println("음수");}
		else {System.out.println("0");}
		scanner.close();
		
		
		//q2) 2의 배수이거나 3의 배수라면 true / false
		//q3) 숫자를 입력받아  0보다크면 양수, 0보다 작으면 음수, 아니라면 0 
		
		//변수 - 입력 - 처리 - 출력
		int q3;
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("좋아하는 숫자?");
		q3= scanner1.nextInt();
		System.out.println((q3>0)?"양수" : (q3<0)?"음수" : "0");
		scanner1.close();
		
		//5. 대입
		a=10;
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		
		
		///////// () 값 비교조건 대입
		
		//6. ++, -- 단항 연산자
		int a1=1, b1=21, c1=1, d1=1;
		System.out.println(++a1); // 증가 후 출력
		System.out.println(a1);
		System.out.println(b1++);  // 출력 후 증가
		System.out.println(b1);
		System.out.println(--c1);
		System.out.println(c1);
		System.out.println(d1--);
		System.out.println(d1);
		
		
		
		
	  }
}


package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx001 {
	public static void main (String [] args) {
		// GIGO 변수 - 입력 -처리 - 출력
	int age = 0;
	System.out.print("당신의 나이를 입력하시오 >");
	Scanner scanner = new Scanner(System.in);
	age = scanner.nextInt();
	System.out.println("당신의 나이는 :" + age + "짤" );
	System.out.printf( "내 나이는 %d 입니다.", age);
	scanner.close();
	
	}
}

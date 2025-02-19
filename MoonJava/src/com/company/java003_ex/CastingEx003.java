package com.compnay.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main (String [] args) {
    // 변수 
	Scanner scanner = new Scanner(System.in);
	//입력
	System.out.print("알파벳 대문자를 입력하세요 : ");
	char str1 = scanner.next().charAt(0);
	//처리+출력
	System.out.println("알파벳 소문자로 변환했습니다 : "+(char)(str1+32));
	scanner.close();
			
	}
		//소문자를 입력하면 대문자로 출력하게끔 프로그램 짜기

	
}


package com.company.java002;

import java.util.Scanner;

public class DataType002 {
	public static void main (String [] args) {
		//OOP? 클래스(부품객체) 조립해 완성해가는 프로그램
		int a=1; //기본형
		Scanner scanner = new Scanner(System.in); // 참조형 ctrl +shift + o
		// 1. 공간 빌리기 heap 1000번지 [     ]
		// 2. Scanner(System.in) 사용할 수 있게 초기화 - 키보드로 입력해
		//    heap 1000번지 [ 키보드 입력 받는 기능 ] <- scanner ##OOP
		
		System.out.print("좋아하는 숫자를 입력하시요 >");
		a = scanner.nextInt(); // 자료형에 맞게 입력받고 처리
		System.out.println("좋아하는 숫자는 :"+ a);
		scanner.close(); 		
	}
}

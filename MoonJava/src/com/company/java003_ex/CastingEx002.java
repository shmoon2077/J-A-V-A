package com.compnay.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		//변수
		int kor=0, eng=0, mat =0;
		//입력
		System.out.print("국어 점수 입력 : ");
		kor = scanner.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = scanner.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = scanner.nextInt();
		//처리
		int total = kor+eng+mat;
		double avg = total/3.0;
		int level = (int)(avg/10);
		
		//출력
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println(":: GOOD IT SCORE::");
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+mat);
		System.out.println("총 점수는 : "+total);
		System.out.printf("평균 점수는 %.2f \n",avg);
		System.out.println("레벨은 : "+level+" 참 잘했어요");
		scanner.close();		
	}
}

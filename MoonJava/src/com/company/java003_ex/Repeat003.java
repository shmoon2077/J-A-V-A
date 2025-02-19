package com.compnay.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int kor,eng,mat;
		int total;
		double avg;
		System.out.print("국어 점수를 입력하세요 >");
		kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 >");
		eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 >");
		mat = scanner.nextInt();
		total = kor+eng+mat;
		avg = total/3.0;
		System.out.println("총 점수는 : " + total );
		System.out.printf("평균 점수는 : %.2f" ,avg);
		scanner.close();
		
	}

}

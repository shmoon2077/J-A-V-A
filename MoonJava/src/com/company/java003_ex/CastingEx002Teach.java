package com.compnay.java003_ex;

import java.util.Scanner;

public class CastingEx002Teach {
	public static void main(String [] args) {
	//GIGO
	//변수
	int kor, eng, mat, total, level;
	double avg;
	Scanner scanner = new Scanner(System.in);
	//입력
	System.out.print("국어 점수 입력 : ");
	kor = scanner.nextInt();
	System.out.print("영어 점수 입력 : ");
	eng = scanner.nextInt();
	System.out.print("수학 점수 입력 : ");
	mat = scanner.nextInt();	
	//처리 (총점, 평균, 레벨)
	total = kor + eng + mat;
	avg = total/3.0; // (double)total/3;
	level = (int)avg/10;
	//출력
	System.out.println(
			":::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
	        "::::                good it score             :::::\n"+
			":::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
	        "국어\t영어\t수학\t총점\t평균\t레벨");
	System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+String.format("%.2f",avg)+"\t"+level);
	} //end main
} // end class

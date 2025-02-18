package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String [] args) {
//		int kor = 0;
//		int eng = 0;
//		int mat = 0;
		int kor, eng, mat, total;
		double avg;
	Scanner score = new Scanner(System.in);
	System.out.print("국어 점수를 입력하시오 >");
	kor = score.nextInt();
	System.out.print("영어 점수를 입력하시오 >");
	eng = score.nextInt();
	System.out.print("수학 점수를 입력하시오 >");
	mat = score.nextInt();
	
	total = kor + eng + mat;
	System.out.println("총점 : "+total);
	avg = total / 3.0;
	System.out.printf("평균 점수 : %.2f",avg);
	score.close();
	}
}
/*
 * 연습문제4)
패키지명 : com.company.java002_ex
클래스명 : DataTypeEx004
출력내용 :  Scanner이용해서  성적처리를 입력받고 출력하시오.
   국어점수를 입력하시오.  _입력받기    100 
   영어점수를 입력하시오.  _입력받기    100 
   수학점수를 입력하시오.  _입력받기    99

   총점 :  299
   평균 :  99.67 
 * */


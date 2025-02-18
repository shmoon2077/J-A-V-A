package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main (String [] args) {
		float pi = 0;
		System.out.print("파이 값을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		pi = scanner.nextFloat();
		System.out.println("파이값은 "+pi+"입니다.");
		System.out.printf("파이값은 %f입니다.\n", pi);
		System.out.printf("파이값은 %.2f입니다.\n", pi);
		System.out.printf("파이값은 %.3f입니다.\n", pi);
		scanner.close();		
		
	}
	
}
	

/*
 * 패키지명 : com.company.java002_ex
클래스명 : DataTypeEx003
출력내용 :  Scanner이용해서 파이값을 입력받고 출력하시오. 
     파이값을 입력하시오 > _입력받기    3.141592    ( 자료형선택 )
     파이값은 **입니다.*/

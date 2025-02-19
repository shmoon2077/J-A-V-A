package com.company.java003;

public class Casting001 {
	public static void main(String [] args) {
		
		// #1. 형변환 - 자동
		byte by = 1;
		short sh = 2;
		int in =4;
		long l =8L;
		float f = 3.14f;
		double d = 3.14;
		
		sh = by;
		in = by;
		l = by;
		l = (long) f; //type mismatch: cannot convert from float to long
		f = l;

		// boolean 1byte
		// boolean bl = true;
		// in = bl;   boolean은 형 변환이 안된다.
		
		// #2. 형변환 - 강제
		by = (byte) in; // 해결방안  1byte  - 4byte
		
		
		int in2 = (int) 1.2; // 정수 (4byte) 실수 (8byte 기본 설정) 
		float fl2 = (float) 3.14; // 실수 (4byte) - 실수 (double 8byte)  
		System.out.println(in2);
		System.out.println(fl2);
		
	    // Q1) 
		System.out.println( 1.5 + 2.7 ); // 결과 3으로 만들기
		System.out.println( (int)1.5 + (int)2.7 ); 
		
	} //end main
} //end class

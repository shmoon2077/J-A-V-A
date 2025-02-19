package com.company.java002;

public class DataType001 {
	public static void main (String [] args) {
		boolean bl = true; // true / false
		System.out.println("1. 논리 :" + bl);
		
		byte by=1; short sh=2; int in=4; long l=8L;
		System.out.println("2. 정수 byte-short-int-long: "+l);

      // 1. 연산 시 +   2. int  ( 기본자료형보다 작은 값 : byte, short) 연산시 주의		
//	  int result = by+sh;
//	  System.out.println(result);
		
		//실수 (float / double )
		
		float fl=3.14f; double d=3.14;
		System.out.println("3. 실수 float - double :" + fl + "\t" + d);
		System.out.println("4. 실수 > 정수");
		fl= l; // fl(실수: 4byte ) - l ( 정수 : 8byte )
		System.out.println(fl);
		
		System.out.println("5. 정밀도");
		// float는 소숫점 7개까지 표현  double 소수점 15개
		float fper1 = 1.0000001f;
		float fper2 = 1.00000001f;		
		double dper1 = 1.123456789123456;
		double dper2 = 1.1234567891234567;
		System.out.println(fper1 + "\t"+ fper2 + "\t" + dper1 + "\t" + dper2);
		
		System.out.println("6. 문자 저장시 숫자로 출력시 문자로");
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		int a = 2<<32;
		int b = 2<<33;
		System.out.println(a + "\t" + b);
		
	}
}

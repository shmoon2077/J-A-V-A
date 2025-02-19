package com.compnay.java003_ex;

import java.util.Scanner;

public class CastingEx001Teach {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		double result;
		System.out.print("숫자를 입력하세요 1");
		num1 = scan.nextInt();
		System.out.print("숫자를 입력하세요 2");
		num2 = scan.nextInt();
		result = (double)num1/num2;

		System.out.println ( num1 + "/" + num2 + "=" + String.format("%.2f",result));
		scan.close();
	}

}

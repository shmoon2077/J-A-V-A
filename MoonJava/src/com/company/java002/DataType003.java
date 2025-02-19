package com.company.java002;

import java.util.Scanner;

public class DataType003 {
	public static void main (String [] args) {
		float f = 3.14f;
		double d = 3.14;
		Scanner scan = new Scanner(System.in);
		System.out.print("실수를 입력하세요. >");
		f = scan.nextFloat();
		System.out.println("입력하신 값은?" + f);
		scan.close();
	}
}

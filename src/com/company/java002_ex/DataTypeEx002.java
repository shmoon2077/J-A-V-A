package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String [] args) {
		double d = 0;
		System.out.print("좋아하는 숫자를 입력하세요 >");
		Scanner scanner = new Scanner(System.in);
		d = scanner.nextDouble();
		System.out.println("좋아하는 숫자는 :  " + d);
		scanner.close();
		} //end main
} // end class

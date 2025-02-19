package com.compnay.java003_ex;

import java.util.Scanner;

public class CastingEx003Teach {
	public static void main (String [] args) {
		//변수
		char ch = ' '; 
		Scanner scanner = new Scanner(System.in);
		//입력
	    System.out.print("대문자를 입력하세요.   ");
	    ch = scanner.next().charAt(0);
		//처리
	    //A 65 a 97
	    //ch += 32;
	    //처리
	    ch = (char)(ch+32); // ch(char 2byte) + 32 (int 4byte)
	    
		//출력
	    System.out.println(ch);
	    scanner.close();
	}
}

package com.company.java002_ex;

public class VarEx002 {
	public static void main(String[] args) {
		int a=0;
		a=10;
		int b=3;
		
		System.out.println (a+"+"+b+"="+(a+b));
		System.out.println (a+"-"+b+"="+(a-b));
		System.out.println (a+"*"+b+"="+(a*b));
		System.out.println (a+"/"+b+"="+(a/b));
		System.out.println (a+"/"+b+"="+ String.format("%.5f",(double)a/b));
		System.out.println (a+"/"+b+"="+((double)a/b));
	    	
		System.out.printf ("%d + %d = %d\n", a, b, a+b);
		System.out.printf ("%d - %d = %d\n", a, b, a-b);
		System.out.printf ("%d * %d = %d\n", a, b, a*b);
		System.out.printf ("%d / %d = %f\n", a, b, a/(float)b);
		
		
//	  정수/정수 = 정수  
// 	  해결방안 정수/실수 or 실수/정수
	}
}

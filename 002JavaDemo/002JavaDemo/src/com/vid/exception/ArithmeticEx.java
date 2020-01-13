package com.vid.exception;

import java.io.IOException;

public class ArithmeticEx {
	public static void main(String[] args) {
		
	int a,b,c,d;
	a=18;
	b=0;
	try {
		c=a/b;
		
	}
	catch (ArithmeticException e) {
		System.out.println("Can't divided by zero");
		System.out.println(a/(b+2));
	}
	/*finally {
		int d=a+b;
		System.out.println("d="+d);*/
	
		/*
		 * int d=a+b; System.out.println(d);
		 */




	}
}

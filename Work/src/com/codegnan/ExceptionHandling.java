package com.codegnan;

public class ExceptionHandling {

	public static void method1() {
		int a=5;
		int b=0;
		int result=0;
		try {
			result=a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		method1();
	}


	

}

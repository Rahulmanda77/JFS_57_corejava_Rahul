package com.codegnan;

public class Factorial {
	public static int factorial(int n) {
		if(n==0 || n==1) {
		return 1;
	}
	int r=n*factorial(n-1);
	return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int r=factorial(num);
		System.out.println(r);

	}

}

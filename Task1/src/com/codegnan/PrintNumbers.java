package com.codegnan;

public class PrintNumbers {
	public static void PrintNumbers(int n) {
		if(n==0) {
			return;
		}
		PrintNumbers(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("Numbers from 1 to "+n);
		PrintNumbers(n);

	}

}

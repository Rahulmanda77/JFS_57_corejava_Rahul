package com.codegnan;

public class Calculator {
	public int addtwoIntegers(int first,int second) {
		return first+second;
	}
	public int addThreeIntegers(int first,int second,int third) {
		return first+second+third;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		System.out.println("Sum of two integers "+cal.addtwoIntegers(10,20));
		System.out.println("Sum of three integers "+cal.addThreeIntegers(10,20,39));

	}

}

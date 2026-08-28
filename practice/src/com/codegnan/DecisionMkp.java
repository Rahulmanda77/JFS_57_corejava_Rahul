package com.codegnan;

import java.util.Scanner;

public class DecisionMkp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the alphabets:");
//		char ch=sc.next().charAt(0);
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//			System.out.println("It is vowel");
//			
//		} else {
//			System.out.println("It is not a vowel");
//		}
//		int num=sc.nextInt();
//		if (num==100) {
//			System.out.println("Police Num");
//		} else if(num==108) {
//			System.out.println("Ambulance Num");
//		} else {
//			System.out.println("Enter valid number");
//		}
// write a java program find given alphabet is upper case or lowercase letter,digit or a special symbol.
//		char ch=sc.next().charAt(0);
//		if(ch>='A' && ch<='Z') {
//			System.out.println("Uppercase Alphabet");
//		} else if(ch>='a' && ch<='z') {
//			System.out.println("Lowercase Aplhabet");
//		} else if(ch>=1 && ch<=9) {
//			System.out.println("Digit");
//		} else {
//			System.out.println("Special Symbol");
//		}
		System.out.println("Welcome to java classes");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(number!=0) {
			if(number>0) {
				System.out.println("It is positive");
			}
			System.out.println("It is negative");
		}

	}

}

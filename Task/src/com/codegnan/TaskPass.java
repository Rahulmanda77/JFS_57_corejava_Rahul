package com.codegnan;

import java.util.Scanner;

public class TaskPass {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		System.out.println("=============================");
		System.out.println("Welcome to codegnan portal");
		System.out.println("=============================");
		Scanner sc=new Scanner(System.in);
		String correctpassword="Nani";
		while(true) {
			System.out.println("Please enter password:");
			String pass=sc.next();
			if(pass.equals(correctpassword)) {
				System.out.println("Login successful");
				break;
			} else {
				System.out.println("Incorrect password,try again");
			}
			
		}
		

	}

}

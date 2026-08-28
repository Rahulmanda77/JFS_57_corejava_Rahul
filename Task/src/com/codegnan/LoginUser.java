package com.codegnan;

import java.util.Scanner;

public class LoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] Users= {{"admin","admin123"},{"john","john123"},{"rahul","rahul123"},{"shaik","shaik123"}};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String enteredUsername=sc.nextLine();
		System.out.println("Enter Password:");
		String enteredPassword=sc.nextLine();
		boolean loginsuccess=false;
		
		for(int i=0;i<Users.length;i++) {
			if(enteredUsername.equals(Users[i][0]) && enteredPassword.equals(Users[i][1])){
				loginsuccess=true;
			break;
			}
		}
		if(loginsuccess!=true) {
			System.out.println("Invalid user");
			
		}else {
			System.out.println("Login successful");
		}

	}

}

package com.codegnan.student;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		/*int marksArray[] = new int[5];
		marksArray[0]=100;
		marksArray[1]=79;
		marksArray[2]=75;
		marksArray[3]=100;
		marksArray[4]=60;
		System.out.println("length of Array:" +marksArray.length);
		
		// retrieve using for loop
		for(int i=0;i<marksArray.length;i++) {
			System.out.println("Array element in index "+i+" :" + marksArray[i]);
		}
		// using enhanced for loop
		for(int element:marksArray) {
			System.out.println(element);*/
		
		
		// StringArray 
//		String FruitsArray[]=new String[3];
//		FruitsArray[0]="Apple";
//		FruitsArray[1]="Cherry";
//		FruitsArray[2]="Banana";
//		for(String element:Fru itsArray) {
//			System.out.println(element);
//		}
//		Student1 std1=new Student1();
//		std1.sId=101;
//		std1.sName="Rahul";
//		std1.sAge=21;
//		
//		Student1 std2=new Student1();
//		std2.sId=102;
//		std2.sName="Uday";
//		std2.sAge=21;
//		
//		Student1 stdArray[]=new Student1[2];
//		stdArray[0]=std1;
//		stdArray[1]=std2;
//		
//		for(Student1 std:stdArray)
//		{
//			System.out.println("Details of student: " +std.sName);
//			
//			System.out.println(std.sId);
//			System.out.println(std.sName);
//			System.out.println(std.sAge);
//		}
		Scanner sc=new Scanner(System.in);
		Student1 std1=new Student1();
		System.out.println("Enter Id:");
		std1.sId=sc.nextInt();
		System.out.println("Enter name:");
		std1.sName=sc.next();
		System.out.println("Enter age:");
		std1.sAge=sc.nextInt();
		Student1 std2=new Student1();
		System.out.println("Enter Id:");
		std2.sId=sc.nextInt();
		System.out.println("Enter name:");
		std2.sName=sc.next();
		System.out.println("Enter Age:");
		std2.sAge=sc.nextInt();
		Student1 stdArray[]=new Student1[2];
		stdArray[0]=std1;
		stdArray[1]=std2;
		for(Student1 std:stdArray) {
			System.out.println(std.sId);
			System.out.println(std.sName);
			System.out.println(std.sAge);
			
		
		}

				
		
	}

}

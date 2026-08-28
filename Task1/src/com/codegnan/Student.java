package com.codegnan;

public class Student {
	int studId;
	String studName;
	double marks1;
	double marks2;
	double marks3;
	
	public Student(int studId,String studName,double marks1,double marks2,double marks3 ) {
		this.studId=studId;
		this.studName=studName;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	public void displayStudentMarks(Student student) {
		System.out.println("Student Id: "+studId);
		System.out.println("Student name: "+studName);
		System.out.println("Percentage: "+percentage(student.marks1,student.marks2,student.marks3));
	}
	public double percentage(double marks1,double marks2,double marks3) {
		double per=((marks1+marks2+marks3)/300)*100;
		return per;
	}

}

package com.codegnan;

public class EmplyeeTest {
	public static void main(String[] args) {
		
			FullTimeEmployee full=new FullTimeEmployee(101,"Rahul","FullTime",10000.0);
			PartTimeEmployee part=new PartTimeEmployee(101,"Nani","Parttime",8,500.0);
			full.displayEmployeeDetails();
			System.out.println("Salary: "+full.calculateSalary());
			System.out.println();
			part.displayEmployeeDetails();
			System.out.println("Salary: "+part.calculateSalary());


	}

}

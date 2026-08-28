package com.codegnan;

public abstract class Employee {
	int employeeId;
	String employeeName;
	
	public Employee(int employeeId,String employeeName) {
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
	}
	public abstract double calculateSalary();	
}

class FullTimeEmployee extends Employee{
	double monthlySalary;
	public FullTimeEmployee(int employeeId,String employeeName,double monthlySalary) {
		super(employeeId,employeeName);
		this.monthlySalary=monthlySalary;
	}
	
	//@override
	public double calculateSalary() {
	return monthlySalary; 
}
}

class PartTimeEmployee extends Employee {
	int hoursWorked;
	double hourlyRate;
	
	public PartTimeEmployee(int employeeId,String employeeName,int hoursWorked,double hourlyRate) {
		super(employeeId,employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
	}
	
	public double calculateSalary() {
		return hourlyRate;
	}
	double Salary=hoursWorked*hourlyRate;
	
}

class EmployeeTest{
	public static void main(String[] args) {
		FullTimeEmployee full=new FullTimeEmployee(101,"Rahul",10000.0);
		PartTimeEmployee part=new PartTimeEmployee(101,"Nani",8,500.0);
		full.displayEmployeeDetails();
		full.calculateSalary();
		part.displayEmployeeDetails();
		part.calculateSalary();
	}
}

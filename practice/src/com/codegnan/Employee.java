	package com.codegnan;

	public abstract class Employee {
		int employeeId;
		String employeeName;
		String empType;
		
		public Employee(int employeeId,String employeeName,String empType) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.empType=empType;
		}
		public void displayEmployeeDetails() {
			System.out.println("Employee Id: "+employeeId);
			System.out.println("Employee Name: "+employeeName);
			System.out.println("Employee Type: "+empType);
		}
		public abstract double calculateSalary();	
	}

	class FullTimeEmployee extends Employee{
		double monthlySalary;
		
		public FullTimeEmployee(int employeeId,String employeeName,String empType,double monthlySalary) {
			super(employeeId,employeeName,empType);
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
		
		public PartTimeEmployee(int employeeId,String employeeName,String empType,int hoursWorked,double hourlyRate) {
			super(employeeId,employeeName,empType);
			this.hoursWorked=hoursWorked;
			this.hourlyRate=hourlyRate;
			
		}
		
		public double calculateSalary() {
			return hoursWorked*hourlyRate;
		}
		
		
	}

	



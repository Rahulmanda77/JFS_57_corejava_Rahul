package com.codegnan.student;

public class Emp {

	public static void main(String[] args) {
		Employee Emp1=new Employee();
		Emp1.EmpId=101;
		Emp1.EmpName="Rahul";
		Emp1.EmpAge=24;
		Emp1.EmpSalary=50000.00;
	
	Employee Emp2=new Employee();
	Emp2.EmpId=102;
	Emp2.EmpName="Nani";
	Emp2.EmpAge=25;
	Emp2.EmpSalary=45000.00;
	
	Employee EmpArray[]=new Employee[2];
	EmpArray[0]=Emp1;
	EmpArray[1]=Emp2;
	
	for(Employee emp:EmpArray) {
		
	System.out.println(emp);
	
	}	
	}

}

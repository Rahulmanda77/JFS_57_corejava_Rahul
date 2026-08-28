package com.codegnan;

public class Employee {
	int id;
	String Name;
	String CompanyName;
	double Salary;
	
	public Employee(int id,String Name,String CompanyName,double Salary) {
		this.id=id;
		this.Name=Name;
		this.CompanyName=CompanyName;
		this.Salary=Salary;
		
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details: "+id+ "\n"+Name+"\n"+CompanyName+"\n"+Salary);
	}

}

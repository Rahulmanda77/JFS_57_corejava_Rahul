package com.codegnan;

public class EmpDemo {
	int empId;
	String empName;
	public EmpDemo(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	public EmpDemo() {
		
	}
	public String toString() {
		return "Employee "+" Id = "+ empId + " Name = " +empName ;
				
		
	}

}

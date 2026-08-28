package com.codegnan;

public class EmployeeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDemo e=new EmpDemo(123, "Rahul");
		EmpDemo e1=new EmpDemo(833, "Suresh");
		EmpDemo e2=new EmpDemo(256, "Bhanu");
		
		EmpDemo emp[]= {e,e1,e2};
		for(EmpDemo empd:emp) {
			System.out.println(empd);
		}
		

	}

}

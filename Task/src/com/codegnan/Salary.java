package com.codegnan;

public class Salary {
	double basic;
	double hra;
	double commission;
	public  Salary(double basic,double hra,double commission){
		this.basic=basic;
		this.hra=hra;
		this.commission=commission;
		
	}
		public double getSalary(Salary salary) {
			
			return salary.basic+salary.hra+salary.commission;
			
		}

}

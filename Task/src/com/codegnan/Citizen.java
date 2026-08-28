package com.codegnan;

public class Citizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen1 c1=new Citizen1();
		c1.cAadharId="172618722768";
		c1.cName="Rahul";
		c1.cGender='M';
		c1.cAge=21;
		
		Citizen1 c2=new Citizen1();
		c2.cAadharId="182268626775";
		c2.cName="Laxmi";
		c2.cGender='F';
		c2.cAge=22;
		
		System.out.println("Citizen Details of c1:"); 
		System.out.println("==========================");
		c1.getCitizenDetails();
		System.out.println();
		
		System.out.println("Citizen Details of c2:");
		System.out.println("===========================");
		c2.getCitizenDetails();

	}

}

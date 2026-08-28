package com.codegnan;

public class Main {
	public Company[] getCompanyList() {
		Company[] c=new Company[2];
		c[0]=new Company(120,"Rahul");
		c[1]=new Company(121,"Nani");
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		Company[] obj=m.getCompanyList();
		for(Company c2 : obj) {
			System.out.println(c2.Id);
			System.out.println(c2.Name);
		}

	}

}
 
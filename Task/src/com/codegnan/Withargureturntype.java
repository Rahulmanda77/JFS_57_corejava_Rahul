package com.codegnan;

public class Withargureturntype {
	public int prod(int x,int y) {
		return x+y;
	}
	public int sum(int x,int y) {
		return x+y;
	}
	public String display(String name) {
		return name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		Withargureturntype m=new Withargureturntype();
		int c=m.sum(a, b);
		System.out.println("Sum of a and b = " +c);
		int d=m.sum(c, 100);
		System.out.println("Sum of c and 100 = "+d);
		int p=m.prod(a, b);
		System.out.println("Prod of a and b = "+p);
		String s=m.display("Rahul");
		System.out.println("Display name: "+s);

	}

}

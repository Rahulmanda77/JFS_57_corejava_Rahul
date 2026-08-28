package com.codegnan;

public class Studenta {
	public void register(String name) {
		System.out.println("Student name: "+name);
	}
	public void register(String name,int age,char gender) {
		System.out.println("Std name: "+name+"\n" +"Age: "+age+"\n" +"Gender: "+gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenta std=new Studenta();
		std.register("Rahul");
		std.register("Rahul",21,'M');

	}

}

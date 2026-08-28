package com.codegnan;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("Raja");
		String man="Raja";
		//String man=name.concat("singh");
		System.out.println(name.concat(" singh"));
		System.out.println(name.charAt(1));
		System.out.println(name.contains("sh"));
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Ra"));
		System.out.println(name==man);
		System.out.println(name.equals(man));

	}

}

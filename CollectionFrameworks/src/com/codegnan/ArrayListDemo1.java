package com.codegnan;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruitsList=new ArrayList<>();
		fruitsList.add("Banana");
		fruitsList.add("Apple");
		fruitsList.add(null);
		fruitsList.add("Banana");
		
		for(String a:fruitsList) {
			System.out.println(a);
		}

	}

}

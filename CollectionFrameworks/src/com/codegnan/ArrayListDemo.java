package com.codegnan;

import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList myList=new ArrayList();
		myList.add("Apple");
		myList.add(100);
		myList.add(true);
		myList.add('c');
		
		myList.remove(0);
		myList.set(0,"Grapes");

	}

}

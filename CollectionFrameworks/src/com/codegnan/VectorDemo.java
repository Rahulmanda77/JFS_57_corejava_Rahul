package com.codegnan;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		List<Integer> vec=new Vector<>();
		vec.add(100);
		vec.add(200);
		vec.add(300);
		
		for(Integer i:vec) {
			System.out.println(i);
		}
	}

}

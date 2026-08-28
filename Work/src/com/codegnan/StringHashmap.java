package com.codegnan;
import java.util.*;

public class StringHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<String,Integer> hm=new HashMap<>();
    String [] arr= {"Rahul","Nani","Rahul","Lucky","Nani"};
    for(int i=0;i<arr.length;i++) {
    	String name=arr[i];
    hm.put(name, hm.getOrDefault(name, 0)+1);
    }
    for(String s:hm.keySet()) {
    	System.out.println("{"+s+" "+hm.get(s)+"}");
    }
	}

}

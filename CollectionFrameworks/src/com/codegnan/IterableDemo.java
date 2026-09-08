package com.codegnan;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {

	public static void main(String[] args) {
		ArrayList<String> countryList=new ArrayList<>();
		countryList.add("India");
		countryList.add("Singapore");
		countryList.add("Srilanka");
		countryList.add("Australia");
		
		//for(String country:countryList) {
		//	System.out.print(country+" ");
		
		Iterator<String> iterator=countryList.iterator();
		while(iterator.hasNext()) {
			String country=iterator.next();
			if(country.equals("Singapore")) {
				iterator.remove();
			}
			
		}
		

	}

}

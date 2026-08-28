package com.codegnan;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		int [] arr= {1,2,3,1,2,4,3,2};
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			if(hm.containsKey(n)) {
				int prev=hm.get(n);
				hm.put(n,prev+1);
			} else {
				hm.put(n,1);
			}
		}
		for(int hash:hm.keySet()) {
			
		
		System.out.print("{"+hash+" "+hm.get(hash)+"}");
		}

	}

}

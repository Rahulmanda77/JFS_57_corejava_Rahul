package com.practicesession;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a prime number");
		}

	}

}

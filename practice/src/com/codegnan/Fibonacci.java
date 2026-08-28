package com.codegnan;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n=sc.nextInt();
//		int a=0;
//		int b=1;
//		for(int i=0;i<=n;i++) {
//			int c=a+b;
//			System.out.println(a+" ");
//			a=b;
//			b=c;
//		}
		// Armstrong
		int num=153;
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		} if(sum==num) {
			System.out.println("Armstrong");
		} else { 
			System.out.println("Not a armstrong");
		}
		
	}

}

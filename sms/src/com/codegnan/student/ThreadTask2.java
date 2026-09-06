package com.codegnan.student;

public class ThreadTask2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadTask2 task=new ThreadTask2();
		task.start();
		
		for(char ch='A';ch<='J';ch++) {
			System.out.println(ch);
		}
	}

}

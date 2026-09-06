package com.codegnan.student;

public class ThreadTask1 implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from Thread");
		}
		
	}
	public static void main(String[] args) {
		ThreadTask1 t=new ThreadTask1();
		Thread t1=new Thread(t);
		t1.start();
		
	}

}

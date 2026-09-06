package com.codegnan.student;

public class ThreadTask extends Thread {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadTask t=new ThreadTask();
		t.start();
	}

}


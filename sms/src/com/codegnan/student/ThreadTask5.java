package com.codegnan.student;

public class ThreadTask5 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Downloading");
		}
	}
	public static void main(String[] args) {
		ThreadTask5 t=new ThreadTask5();
		t.start();
		try {
			t.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
		System.out.println("Processing");
		}
	}
	

}

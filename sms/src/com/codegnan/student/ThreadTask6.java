package com.codegnan.student;
class Threadmy extends Thread {
	public void run() {
		System.out.println("Thread name:"+getName());
	}
}
class ThreadNew extends Thread{
	public void run() {
		System.out.println("Thread name:"+getName());
	}
}
class ThreadOld extends Thread{
	public void run() {
		System.out.println("Thread Name:"+getName());
	}
}
public class ThreadTask6 extends Thread{
	public static void main(String[] args) {
		Threadmy m=new Threadmy();
		ThreadNew n=new ThreadNew();
		ThreadOld o=new ThreadOld();
		m.setName("Download Thread");
		n.setName("Upload Thread");
		o.setName("Payment Thread");
		
		m.start();
		n.start();
		o.start();  
	}
}
			



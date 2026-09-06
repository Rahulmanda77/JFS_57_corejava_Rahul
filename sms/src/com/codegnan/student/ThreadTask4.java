package com.codegnan.student;

public class ThreadTask4 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		public static void main(String[] args) {
			ThreadTask4 t=new ThreadTask4();
			t.start();
			
			}
			
			
		}
			
	



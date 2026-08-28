package com.practicesession;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(PrintWriter writer=new PrintWriter(new FileWriter("student.txt"))){
			writer.println("Student Details");
			writer.println("Name : Rahul");
			//writer.println("Age : 21");
			//writer.println("Course : Java");
			writer.printf("Percentage: %.2f", 82.4455);
			writer.printf("Age:%d%n","Rahul");
			System.out.println("Data written successfully");
		} catch(IOException e) {
			e.printStackTrace(); 
		}

	}

}

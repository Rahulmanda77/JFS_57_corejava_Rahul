package com.codegnan;

public class Arithmetic {

	public void add(int mark1, int mark2, String studentname) {
		System.out.println("Total marks for " + studentname + ": " + (mark1 + mark2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Arithmetic std = new Arithmetic();
		std.add(90, 85, "Rahul");

	}

}

//Create a class "course"-couseId,courseName,courseDuration
//-use a parameterized constructor that can initialize course object
//
//create 3 course objects
//create an array of course object and store the 3 course objects.
//
//create a method called displayCourseList(course[] course) 

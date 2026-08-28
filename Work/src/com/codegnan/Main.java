package com.codegnan;

class NotEligibleForCourseException extends Exception {
	NotEligibleForCourseException(String msg){
		super(msg);
	}

}
class Student{
	String name;
	double percentage;
	Student(String name, double percentage){
		this.name=name;
		this.percentage=percentage;
	}

void enrollCourse() throws Exception{
if(percentage<60) {
	throw new NotEligibleForCourseException("Student Not eligible for course enrollment");
} else {
	System.out.println("Student Enrollment sucessfull");
}
}
}

public class Main{
	public static void main(String [] args) {
		Student std=new Student("Rahul",55.0);
		try {
			std.enrollCourse();
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


package com.codegnan;

public class Course {
	int Id;
	String Name;
	int Duration;
	
	public void course(int Id,String Name,int Duration) {
		this.Id=Id;
		this.Name=Name;
		this.Duration=Duration;
	}
	public void displayCourseList(Course c) {
		System.out.println("CourseId : "+c.Id+",CourseName : "+c.Name+",CourseDuration : "+c.Duration);
		
	}

}

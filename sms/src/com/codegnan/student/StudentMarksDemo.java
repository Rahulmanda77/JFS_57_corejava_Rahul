package com.codegnan.student;

public class StudentMarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2 dimensional int arry
		int sMarks[][]=new int[2][2];
		
		//marks for student1-row0
		sMarks[0][0]=70;
		sMarks[0][1]=80;
		
		//marks for student2-reow1
		sMarks[1][0]=90;
		sMarks[1][1]=70;
		
		//Displaying  the marks of each student
		//outer for loop for rows
		//inner for loop to read the marks of each marks
		//sMarks.length returns the number of rows in a arry
		for(int i=0;i<sMarks.length;i++) {
			for(int j=0;j<sMarks[i].length;j++) {
				System.out.print(sMarks[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}

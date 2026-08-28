package com.codegnan.student;

public class RaggedArrayDemo {
	public static void main(String[] args) {
		
	int [][] mArray= {{10,30},{20,30,40},{60},{70,90,80,100}};
	
	for(int i=0;i<mArray.length;i++) {
		
		System.out.println("Row "+i);
		System.out.println("Number of columns :"+mArray[i].length);
		for(int j=0;j<mArray[i].length;j++) {
			System.out.print(mArray[i][j] +" ");
		}
		System.out.println();
		
		
	}



	}

}

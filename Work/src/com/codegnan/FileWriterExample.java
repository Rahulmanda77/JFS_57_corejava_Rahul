package com.codegnan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("myfile.txt");
		//FileWriter writer=null;
		try(FileWriter writer=new FileWriter(file)) {
		
		
		 //writer=new FileWriter(file);
		
		writer.write("India is my country");
		writer.write("\n I love my country");
		char[] charArray= {'a','e','i','o','u'};
		writer.write("\n");
		writer.write(charArray);
		writer.flush();
		
		} catch(IOException e) {
			System.out.println("please make sure the file exists");
			e.printStackTrace();
		} //finally {
			//try{
			//	writer.close();
			//} catch(IOException e) {
				//e.printStackTrace();
			//}
		//}
		

	}

}

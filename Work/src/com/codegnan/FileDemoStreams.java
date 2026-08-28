package com.codegnan;
import java.io.File;
import java.io.IOException;
public class FileDemoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try{
			File dir=new File("MyNotes");
			dir.mkdir();
			
			File file1=new File(dir,"Exception");
			file1.createNewFile();
			
			File file3=new File(dir,"Result");
			file3.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}

	}

}

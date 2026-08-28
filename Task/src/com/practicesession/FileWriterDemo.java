package com.practicesession;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer=null;
		FileReader reader=null;
		try {
			File file=new File("feedback.txt");
			writer=new FileWriter(file);
			writer.write("Rahul");
			writer.write("\nJava");
			writer.write("\nGood");
			writer.flush();
			
			reader=new FileReader(file);
			
			int character;
			while((character=reader.read())!=-1) {
				System.out.print((char)character);
			}
			} catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					writer.close();
					reader.close();
				}  catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}

	}



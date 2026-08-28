package com.codegnan;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader reader=new FileReader("myfile.txt")){
			System.out.println("Reading the contents of myfile.txt");
			int character;
			while((character=reader.read())!=-1) {
				System.out.print((char)character);
			}
		}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}



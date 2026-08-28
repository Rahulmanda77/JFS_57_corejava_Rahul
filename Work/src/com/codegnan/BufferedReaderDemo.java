package com.codegnan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader reader=new BufferedReader(new FileReader("output.txt"))){
			System.out.println("Reading");
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}

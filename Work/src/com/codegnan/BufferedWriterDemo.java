package com.codegnan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try(BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"))){
			writer.write("hello Codegnan!");
			writer.newLine();
			writer.write("Buffered writer is faster for large taxt files");
			writer.flush();
			System.out.println("Data is written successfully to output.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

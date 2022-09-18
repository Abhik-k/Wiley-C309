package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("first.txt",true);
			fw.write("I am adding the text into file");
			System.out.println("File added");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) {
		BufferedReader reader=null;
			try {
				FileReader fr;
				fr = new FileReader(new File("first.txt"));
				reader=new BufferedReader(fr);
				String line=null;
				System.out.println(reader.readLine());
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
			}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			 catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		
		
		
	}
}

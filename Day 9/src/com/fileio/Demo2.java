package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("first.txt",true);
			byte[] data="Welcome to Java Abhi".getBytes();
			try {
				fos.write(data);
				System.out.println("Data added into the file");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

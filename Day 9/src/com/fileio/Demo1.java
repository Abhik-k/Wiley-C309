package com.fileio;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
		File f=new File("first.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("File Created");
			}
			else {
				System.out.println("File already Present");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}

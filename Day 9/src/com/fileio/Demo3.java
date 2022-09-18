package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		File f=new File("first.txt");
		try {
			FileInputStream fin=new FileInputStream(f);
			//FileInputStream fin1=new FileInputStream("first.txt");
			//FileInputStream fin2=new FileInputStream(new File("file.txt"));
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	public static void main(String[] args) {
		Student student1=new Student("ABHI", 7.9, "WILEYc309",new Date(12,6,22));
		
		serializeStudent(student1);
		Student s=deSerializeStudent();
		System.out.println(s);
}

	private static Student deSerializeStudent() {
		// TODO Auto-generated method stub
		FileInputStream fis;
		Student s=null;
		try {
			fis=new FileInputStream("student.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s=(Student)ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}

	private static void serializeStudent(Student student1) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("student.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(student1);
			System.out.println("Object is Serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}

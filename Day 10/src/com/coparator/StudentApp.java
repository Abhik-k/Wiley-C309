package com.coparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentApp {
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student(101, "Abhishek", 23));
		student.add(new Student(105, "Virat", 32));
		student.add(new Student(107, "Mahi", 37));
		student.add(new Student(115, "Rohit", 21));
		
		System.out.println("****************");
		System.out.println("Before Sorting");
		System.out.println(student);
		System.out.println("****************");
		
		System.out.println("Sorting By Name");
		Collections.sort(student,new NameComparator());
		//Using enhanced for-loop
//		for(Student st:student) {
//			System.out.println(st);
//		}
		//Using Iterator
		Iterator itr=student.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		}  
		
		System.out.println("********************");
		
		System.out.println("Sorting by age"); 
		Collections.sort(student, new AgeComparator());
//		Iterator itr2=student.iterator();  
//		while(itr2.hasNext()){  
//		Student st=(Student)itr2.next();  
//		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
//		}  
		for(Student st:student) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
		
		System.out.println("**************************");
		System.out.println("Soprting by Roll No");
		Collections.sort(student,new RollNoComparator());
		for(Student st:student) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
	}
}

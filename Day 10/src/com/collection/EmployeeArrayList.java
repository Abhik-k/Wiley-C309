package com.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayList {
	public static void main(String[] args) {
//		Employee e1=new Employee("Abhishek","Kumar");
//		Employee e2=new Employee("Kaivan","Shah");
//		Employee e3=new Employee("Sandipt","Singh");
//		Employee e4=new Employee("Virat","Kohli");
//		Employee e5=new Employee("Rohit","Sharma");
//		
//		List<Employee> empList=new ArrayList<>();
//		empList.add(e1);
//		empList.add(e2);
//		empList.add(e3);
//		empList.add(e4);
//		empList.add(e5);
		
//		System.out.println(empList);
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("Abhishek","Kumar"));
		empList.add(new Employee("Kaivan","Shah"));
		empList.add(new Employee("Sandipt","Singh"));
		empList.add(new Employee("Virat","Kohli"));
		empList.add(new Employee("Rohit","Sharma"));
		
		System.out.println(empList);
		
		
	} 
}

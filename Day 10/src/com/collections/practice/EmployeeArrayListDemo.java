package com.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeArrayListDemo {
	public static void main(String[] args) {
//		List<Employee> empList=new ArrayList<>();
//		empList.add(new Employee("Abhishek","Kumar"));
//		empList.add(new Employee("Kaivan","Shah"));
//		empList.add(new Employee("Sandipt","Singh"));
//		empList.add(new Employee("Virat","Kohli"));
//		empList.add(new Employee("Rohit","Sharma"));
		
		
		List<Employee> empList= Arrays.asList(new Employee("Abhishek","Kumar"),new Employee("Kaivan","Shah"),new Employee("Sandipt","Singh"),new Employee("Virat","Kohli"));
		
		
		System.out.println(empList);
		
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
}

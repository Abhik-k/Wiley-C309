package com.collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetDemo {
	public static void main(String[] args) {
		Set<Employee> empSet=new TreeSet<>();
		empSet.add(new Employee("Abhishek","Kumar"));
		empSet.add(new Employee("Kaivan","Shah"));
		empSet.add(new Employee("Abhishek","Kumar"));
		empSet.add(new Employee("Sandipt","Singh"));
		empSet.add(new Employee("Virat","Kohli"));
		empSet.add(new Employee("Rohit","Sharma"));
		
		System.out.println("Employees in Descending LastName Sort Algo:");
		//Comparable
		for(Employee emp:empSet) {
			System.out.println(emp);
		}
		
		
		//Comparator
		System.out.println("********************");
		//Collections.sort(list, new Comparator());
		
		//Collections takes list and the object of class which implements Comparator 
		List<Employee> empList=new ArrayList<>(empSet);
		Collections.sort(empList,new EmpoloyeeSortByAscendingFirstName());
		
		System.out.println("Employee in Ascending FirstName Sort Algo:");
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		System.out.println("********************");
		Collections.sort(empList,new EmployeeSortByDescendingFirstName());
		System.out.println("Employee in Descending FirstName Sort Algo:");
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		System.out.println("********************");
		Collections.sort(empList,new EmployeeSortByAscendingLastName());
		System.out.println("Employee in Ascending LastName Sort Algo:");
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
}

package com.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSetDemo {
	public static void main(String[] args) {
		//To add object in Set, we need to override equals() and hashCode().
		//If all the objects have different hashcode than equals() method is not invoked
		Set<Employee> empSet=new HashSet<>();
		empSet.add(new Employee("Abhishek","Kumar"));
		empSet.add(new Employee("Kaivan","Shah"));
		empSet.add(new Employee("Abhishek","Kumar"));
		empSet.add(new Employee("Sandipt","Singh"));
		empSet.add(new Employee("Virat","Kohli"));
		empSet.add(new Employee("Rohit","Sharma"));
		
		System.out.println(empSet);
		
		for(Employee emp:empSet) {
			System.out.println(emp);
		}
	}
}

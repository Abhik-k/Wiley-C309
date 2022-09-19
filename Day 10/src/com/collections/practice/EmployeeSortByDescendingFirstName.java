package com.collections.practice;

import java.util.Comparator;

public class EmployeeSortByDescendingFirstName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getFirstName().compareTo(o1.getFirstName());
	}

}

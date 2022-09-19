package com.collections.practice;

import java.util.Comparator;

public class EmpoloyeeSortByAscendingFirstName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}

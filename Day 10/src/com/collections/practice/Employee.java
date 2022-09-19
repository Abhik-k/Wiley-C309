package com.collections.practice;

public class Employee implements Comparable<Employee>{
	private String firstName;
	private String lastName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstName+" : "+this.lastName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Equals method invoked!!");
		Employee e=(Employee)obj;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.firstName.length();
	}
	
	//Natural Ordering
	@Override
	public int compareTo(Employee o) {
		// Sorting based on firstName
		//return this.firstName.compareTo(o.firstName);
		
		//Sorting based on lastName
		//return this.lastName.compareTo(o.lastName);
		
		//Sorting based on Descending order of firstName
		//return o.firstName.compareTo(this.firstName);
		
		//Sorting based on Descending order of lastName
		return o.lastName.compareTo(this.lastName);
	}
	
	
	
	
}

package com.collection;

public class Employee implements Comparable<Employee>{
	private String fname;
	private String lname;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Employee(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.fname+":"+this.lname;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.fname.length();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		return this.fname.equals(e.fname) && this.lname.equals(e.lname);
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.fname.compareTo(o.fname);
	}
	
}

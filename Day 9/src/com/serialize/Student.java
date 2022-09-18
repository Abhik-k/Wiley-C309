package com.serialize;

import java.io.Serializable;

public class Student implements Serializable{
	 String name;
	 double cgpa;
	 String regNo;
	 Date dateofAdmission;
	public Student(String name, double cgpa, String regNo,Date dateofAdmission) {
		this.name = name;
		this.cgpa = cgpa;
		this.regNo = regNo;
		this.dateofAdmission=dateofAdmission;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student ["+this.name+", "+this.cgpa+", "+this.regNo+"]";
	}
	 
}

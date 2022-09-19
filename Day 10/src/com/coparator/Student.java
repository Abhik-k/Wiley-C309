package com.coparator;


public class Student{
	private int rollno;
	private String name;
	private int age;
	static int studentCount;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		studentCount++;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[RollNo-"+this.rollno+": Name-"+this.name+": Age-"+this.age+"]";
	}
	
	
}
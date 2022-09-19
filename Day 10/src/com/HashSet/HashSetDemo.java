package com.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<Integer> numbers=new HashSet<Integer>();
		//unique and unordered
		
		numbers.add(80);
		numbers.add(32);
		numbers.add(89);
		numbers.add(74);
		numbers.add(74);//duplicate
		numbers.add(null);
		numbers.add(null);//duplicate
		numbers.add(60);
		
		System.out.println(numbers);
		
		
		
		Set<Integer> numbers1=new TreeSet<Integer>();
		numbers1.add(25);
		numbers1.add(12);
		numbers1.add(25);
		numbers1.add(2);
		//numbers1.add(null); --- Error
		
		System.out.println(numbers1);
	}
}

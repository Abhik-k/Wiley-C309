package com.TreeSet;
import java.util.Set;
import java.util.*;


public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> numbers=new TreeSet<Integer>();
		//unique and unordered
		
		numbers.add(80);
		numbers.add(32);
		numbers.add(89);
		numbers.add(74);
		numbers.add(74);//duplicate
		//numbers.add(null); 
		//numbers.add(null);//duplicate
		numbers.add(60);
		
		System.out.println(numbers);
	}
}

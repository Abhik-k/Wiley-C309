package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListConcepts {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(25);
		list.add(87);
		list.add(99);
		list.add(99);
		
		System.out.println(list);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(11);
		list2.add(27);
		list2.add(27);
		
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list.indexOf(27));
		
		//Slower
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//Enhanced For Loop -- Faster than above
		for(Integer number: list) {
			int data=number.intValue();
			System.out.print(data+" ");
		}
		
		//Iterator
		Iterator<Integer> numberIterator =list.iterator();
		while(numberIterator.hasNext()) {
			int data=numberIterator.next().intValue();
			System.out.print(data+" ");
			if(data%2==0)
				numberIterator.remove();
		}
		System.out.println();
		System.out.println(list);
		
		ListIterator<Integer> mylistIterator= list.listIterator();//bidirectional
//		while(mylistIterator.hasPrevious()) {
//			int data=mylistIterator.next().intValue();
//			}
		
	}
}

package com.HashMap;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,String> myMap=new HashMap<>();
		myMap.put("M101","Abhi");
		myMap.put("M202","Kumar");
		myMap.put("null", "AK");
		System.out.println("HashMap: "+myMap);
		
		String name=myMap.get("M101");
		System.out.println(name);
		
		String s=myMap.getOrDefault("M201", "Some Default");
		System.out.println(s);
		
		String s1=myMap.getOrDefault("M101", "Default Value");
		System.out.println(s1);
		
		System.out.println("KeySet: "+myMap.keySet());
		System.out.println("Values: "+myMap.values());
		
		Set<Entry<String,String>> mySet=myMap.entrySet();
		System.out.println("EntrySet: "+mySet);
		
		for(Map.Entry<String, String> ele: myMap.entrySet()) {
			System.out.println("Key: "+ele.getKey()+" - Value: "+ele.getValue());
		}
	}
}

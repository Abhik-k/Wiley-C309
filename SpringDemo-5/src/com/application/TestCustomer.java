package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;

public class TestCustomer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Customer c=(Customer)context.getBean("customer");
		System.out.println("Customer retrived!!");
	}
}

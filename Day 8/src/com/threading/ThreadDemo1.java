package com.threading;

public class ThreadDemo1 extends Thread {
	
	//implicitly invoked when the thread executes
	public void run() {
		System.out.println("Thread Demo1 is Executed");
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		ThreadDemo1 demo1 =new ThreadDemo1();
		//demo1.run();
		ThreadDemo1 demo2 =new ThreadDemo1();
		ThreadDemo1 demo3 =new ThreadDemo1();
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		demo1.setName("My Thread");
		
		demo1.start();
		demo2.start();
		demo3.start();
		
	}
}

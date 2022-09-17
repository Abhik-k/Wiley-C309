package com.threading;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Invoked");
		
	}
	
	public static void main(String[] args) {
		ThreadDemo2 demo2= new ThreadDemo2();
		Thread t1 = new Thread(demo2);
		t1.start();
	}

}

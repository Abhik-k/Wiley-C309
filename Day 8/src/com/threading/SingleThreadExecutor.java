package com.threading;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;   

public class SingleThreadExecutor {  
	    public static void main(String[] args) {  
	        System.out.println("current thread : " + Thread.currentThread().getName());  
	  
	        System.out.println(" Executor Service...");  
	        //Has only a Single Thread
	        //Used to execute tasks in sequential order
	        
	        ExecutorService ex  = Executors.newSingleThreadExecutor();
	        //calling newSingleThreadExecutor method of Executors class
	  
	        System.out.println("Runnable...");  
	        Runnable runnable = new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(":: " + Thread.currentThread().getName());
					
				} 
	        };  
	        System.out.println("Submit the task ");  
	        ex.submit(runnable); //Submits a Runnable task for execution 
	   }  
}   
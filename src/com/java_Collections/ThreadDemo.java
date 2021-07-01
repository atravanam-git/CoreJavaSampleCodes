//This code inherits Thread Class
package com.java_Collections;
public class ThreadDemo extends Thread{
	public void run() {
		Thread t =new Thread();
		System.out.println("Thread Name under run() is "+ t.getName() + " Priority is " + t.getPriority());
	}
	
	public static void main(String[] args) {
		// Create class reference variable
		ThreadDemo t = new ThreadDemo();
		ThreadDemo t1 = new ThreadDemo();
		
		System.out.println( "Thread Name under main() is " + t.getName() + " Priority is " + t.getPriority());
		t.setPriority(MIN_PRIORITY);
		t1.setPriority(MAX_PRIORITY);
		t.start();
		t1.start();
	}
}
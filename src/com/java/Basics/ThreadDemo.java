//get the current thread reference by using currentThread() method
//it is a static public method present in Thread class
package com.java.Basics;
public class ThreadDemo {
	public static void main(String[] args) {
		String thr;
	// Creating a Thread reference variable t and assigning the current running thread
		Thread t= Thread.currentThread();
		System.out.println("Current Thread is: "+ t);

	// Changing the thread name and printing the same
		t.setName("Praveen");
		thr=t.getName();
		System.out.println("New Thread Name is: "+ thr);
		
	}

}

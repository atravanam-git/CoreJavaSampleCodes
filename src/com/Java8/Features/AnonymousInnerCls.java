/* Anonymous Inner Class does not have a NAME
 * Anonymous class can EXTEND a parent class or IMPLEMENT an Interface */
package com.Java8.Features;
import java.lang.Thread;
public class AnonymousInnerCls {

	public static void main(String[] args) {
		
//		Anonymous Inner class implementing Runnable Interface
//		'r' is not an object of Runnable(I) but rather implementation class of Runnable (I)
		Runnable r= new Runnable() 
		{
			public void run(){
				for(int i=0; i<=5;i++) {
					System.out.println("Child Thread");
				}
			}
		};
//		Thread class 't' reference variable is calling Runnable implementation class
		System.out.println("Thread Class calling Runnable Interfface 'r' ");
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<=5;i++) {
			System.out.println("Main Thread");
		}
	}
}
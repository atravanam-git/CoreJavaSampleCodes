/* Anonymous Inner Class does not have a NAME
 * Anonymous class can EXTEND an Abstract Class or Parent Class or IMPLEMENT an Interface 
*/
package com.Java8.Features;
import java.lang.Thread;
public class AnonymousInnerClassWithLambdaExpression {
public static void main(String[] args) {
		
//		Anonymous Inner class implementing Runnable Interface
//		'r' is not an object of Runnable(I) but rather implementation class of Runnable (I) 
//		Lambda Expression usage
		System.out.println("Lambda Expression Demo");
		Runnable r= () -> {
				for(int i=0; i<=5;i++) {
					System.out.println("Child Thread");
				}
		};
		
//		Thread class 't' reference variable is calling Runnable implementation class
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<=5;i++) {
			System.out.println("Main Thread");
		}
	}

}

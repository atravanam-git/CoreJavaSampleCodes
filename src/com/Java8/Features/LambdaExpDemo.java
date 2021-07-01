/* Lambda expression is an Anonymous function
 * Lambda always used for implementing Functional Interface
 * Lambda expression need not have data types explicitly mentioned
 * Lambda expression reduces lines of codes */
package com.Java8.Features;

public class LambdaExpDemo {

	public static void main(String[] args) {
//		Lambda expression Syntax: (argument list) -> { body}
//		Lambda expression overriding square() method
		FunctionalInterface i = (x) -> System.out.println("Square of "+ x + " is: "+ x*x);
		i.square(10);
	}
}
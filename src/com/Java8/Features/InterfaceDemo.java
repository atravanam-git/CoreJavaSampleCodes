/* From 1.8v onwards an Interface can contain the following:
 * Default Methods
 * Static Methods
 * Abstract Methods 
 * Main() Method and 
 * Anonymous inner class 
*/
package com.Java8.Features;

public interface InterfaceDemo {
		
	default void calcMethod(char opr, int x, int y) {
	//	Ternary operator OR Conditional Operator
		int result = (opr=='+')? (x+y):(opr=='*')? (x*y):(opr=='/')?(x/y):(x-y);
		System.out.println("Default Calc Method for operation "+opr+ " " + result);
	}
	
	// Abstract method-1
	public void m1();
	
	//Abstract method-2
	public void m2();
	
	public static void main(String[] args) {
		System.out.println("Static Main() Method Inside an Interface");
//		Anonymous Inner Class
		InterfaceDemo i = new InterfaceDemo() 
		{
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m2()");
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m1()");
			}
		};
		i.m1();
		i.m2();
		i.calcMethod('*', 10, 20);
	}
}

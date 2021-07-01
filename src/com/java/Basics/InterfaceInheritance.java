// This code is an example of multiple inheritance of Interfaces and
// How to call same methods present in both the interfaces
package com.java.Basics;

public class InterfaceInheritance implements InterfaceOne, InterfaceTwo {
public static void main(String[] args) {
		
//		declare a class instance variable
		InterfaceInheritance c = new InterfaceInheritance();
		
//		Calling the overridden methods within the class
		c.m1();
		c.m2();
		c.show(); 
	}
	
	@Override
	public void show() {
		System.out.println("show method present in class");
	}

	@Override
	public void m1() {
		System.out.println("M1 Method");
//		calling the default methods of InterfaceOne
		InterfaceOne.super.show();
		
	}
	
	@Override
	public void m2() {
		System.out.println("M2 Method");
//		calling the default methods of InterfacesTwo
		InterfaceTwo.super.show();
	}

}

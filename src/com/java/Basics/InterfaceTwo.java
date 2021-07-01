package com.java.Basics;
public interface InterfaceTwo
{
//	Every method within an interface is public and abstract
	void m2();
	public default void show()
	{
		System.out.println("Default Method in InterfaceTwo");
	}

}

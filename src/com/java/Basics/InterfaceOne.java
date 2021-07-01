/* Default methods can be only defined in the interface
 * Default method provides only dummy implementation
 * Default methods are only optional for implementation by classes */
package com.java.Basics;
public interface InterfaceOne
{
//	Default method cannot be used in Classes
	public default void show() 
	{
		System.out.println("Default Method in InterfaceOne");
	}
//	Every method within an interface is public and abstract
	void m1();
}
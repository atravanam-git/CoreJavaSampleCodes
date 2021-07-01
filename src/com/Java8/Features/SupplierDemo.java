//Supplier<R> - No Inputs -> But returns objects 
//Supplier(I) contains get() method
package com.Java8.Features;
import java.util.Date;
import java.util.function.Supplier;
public class SupplierDemo {
	public static void main(String[] args)
	{
//	Supplier Functional Interface
		Supplier<Date> s =()-> new Date();
		System.out.println("Date is :" +s.get());
		}
}

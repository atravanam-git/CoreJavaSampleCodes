package com.java.Collections;
import java.util.*;
public class genericsWildCard_Demo {
	public static void main(String[] args) {
//		Declare a String ArrayList
			ArrayList<String> aL=new ArrayList<String>();	
			aL.add("Praveen");
			aL.add("Naveen");
			aL.add("Kareem");
			
//			Declare an Integer ArrayList
				ArrayList<Integer> aL1=new ArrayList<Integer>();	
				aL1.add(10);
				aL1.add(20);
				aL1.add(25);
		
//			Calling the same display method with different AL data types
				System.out.println("Showing String Array");	
				showArray(aL);
				
				System.out.println("Showing Integer Array");
				showArray(aL1);
		}
		
//		Generic Wild Card Character '?'
//		This type of method is best suitable for read only operation
		public static void showArray(ArrayList<?> aL) {
//			We can only add Null value but not any other values
			aL.add(null);
			for(Object aL1: aL) {
				System.out.println("showArray(ArrayList<?> aL) "+ aL1);	
			}
		}
		
		/*
		 * // showArray(ArrayList<? extends X> aL) - X can be either class or Interface
		 * public static <T>void showArray1(ArrayList<? extends Employee> aL1) {
		 * System.out.println("X can be either class or Interface"); }
		 * 
		 * // showArray(ArrayList<? extends super X> aL) - X can be either class or
		 * Interface public static void showArray2(ArrayList<? extends super X> aL) {
		 * System.out.println("X can be either class or Interface"); }
		 */


}

/*
 * ArrayList is used for overcoming the problems of fixed length of normal
 * arrays // ArrayList can store generic, non-generic like string, integer and
 * Class instance object variables */	
package com.java_Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class basics_of_ArrayLists {
	public static void main(String[] args) {
//		Non-Generic Arrays - Example an ArrayList of String Class
		ArrayList<String> strArr=new ArrayList<String>();
		
//		Non-Generic Arrays - Example an ArrayList of Integer Class
		ArrayList<Integer> intArr=new ArrayList<Integer>();
		
//		Non-Generic Arrays - Example an Array of Employee Class type
		ArrayList<Employee> empArr=new ArrayList<Employee>();
		
//		Operations on String ArrayList
//		Adding elements using the add() method
		strArr.add("Praveen");
		strArr.add("Pawan");
		strArr.add("Naveen");
		strArr.add("Zero");
		strArr.add("Atravanam");
		System.out.println("String Array Size is: "+ strArr.size());
		
//		Operations on Integer ArrayList
//		Adding elements using the add() method
		intArr.add(10);
		intArr.add(20);
		intArr.add(30);
		intArr.add(40);
		intArr.add(50);
		intArr.add(50);
		System.out.println("Integer Array Size is: "+ intArr.size());
		
//		Operations on Employee Class ArrayList
//		Create an Object Reference on Employee class
		Employee objRef=new Employee("Praveen",25,"IT",'M');
		Employee objRef1=new Employee("Naveen",55,"IT",'M');
		Employee objRef2=new Employee("Eleen",25,"HR",'F');

//		Adding elements using the add() method
		empArr.add(objRef);
		empArr.add(objRef1);
		empArr.add(objRef2);
		System.out.println("Employee Array Size is: "+ empArr.size());
		
//		Printing ArrayList with FOR LOOP;
		
		System.out.println("\nprinting String ArrayList using FOR Loop"+"\n");
		for (int i=0; i<strArr.size(); i++) {
//		Using the get() method to fetch values string ArrayList
			System.out.println("strArray values are: "+ i + "\t"+ strArr.get(i));	
		}
		
		System.out.println("\nprinting Integer ArrayList using FOR Loop"+ "\n");
		for (int i=0; i<intArr.size(); i++) {
//		Using the get() method to fetch values Integer ArrayList
			System.out.println("intArray values are: "+ i + "\t" + intArr.get(i));	
		}
		
		/*
		 * We cannot use FOR LOOP or Get() method for Class Objects ArrayList Need to
		 * use the following:
		 * WHILE LOOP 
		 * Iterator() method 
		 * hasNext() method 
		 * next() method
		 */				
		
		// declaring an iterator method -- assign Employee ArrayList.iterator() to Iterator Employee type cast
		Iterator<Employee> itr= empArr.iterator();
		
		while(itr.hasNext()){
			Employee emp=itr.next();
			System.out.println("Employee Name:" + emp.name);
			System.out.println("Employee Dept:" + emp.dept);
			System.out.println("Employee Age:" + emp.age);
			System.out.println("Employee Gender:"+ emp.gender);
		}

	}

}

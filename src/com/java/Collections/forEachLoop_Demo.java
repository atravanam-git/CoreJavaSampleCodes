/* 
1. ArrayList should be used ONLY when the frequent operation is 
   # Retrieval of data since it implements RandomAcess Interface a.k.a. Marker Interface
   # A Marker Interface is an interface with NO Methods in it.
2. ArrayList should NOT be used if our frequent Operation is 
   # either Insertion and Removal */

package com.java.Collections;
import java.util.ArrayList;

public class forEachLoop_Demo {
/*This code demonstrates For-Each Loop concept with different fixed and dynamic Arrays
	Example-1: We declare a normal array with fixed length
	Example-2: We declare a String Array with fixed length
	Example-3: We declare a Non-Generic Integer ArrayList
	Example-5: We declare a Generic ArrayList*/
	public static void main(String[] args) {

//		Ordinary Array declarations
			int intArr[]= {2,3,52,45,23,56};
			String strArr[]= {"Ravi","Praveen","Random","Create","Remove"};
			
			System.out.println("Printing output for ordinary Array");
//			For-Each Loop to print the array values
			System.out.println("Printing Integer Array values: ");
			for(int i:intArr) {
				System.out.println(i);
			}
			
			System.out.println("Printing String Array values: ");

//		For-Each Loop Syntax: for(data-type variable: array | Collection)
			for(String i:strArr) {
				System.out.println(i);
			}
			
//		Declare ArrayList of Employee Class Objects
			ArrayList<Employee> arrEmp=new ArrayList<Employee>();
			
			
//			ArrayList Data Insertion
			arrEmp.add(new Employee("Praveen",24,"IT",'M'));
			arrEmp.add(new Employee("Naveen",22,"IT",'M'));
			arrEmp.add(new Employee("Veena",24,"Admin",'F'));
			arrEmp.add(new Employee("Reena",24,"Fin",'F'));
			
//			Print the ArrayList
			for(Employee e1:arrEmp) {
				System.out.println("Employee Name is: "+e1.name + "Employee Age is: "+ e1.age+"Employee Dept is: "+ e1.dept+"Employeee Gender is: " +e1.gender);			
			}
	}	
}



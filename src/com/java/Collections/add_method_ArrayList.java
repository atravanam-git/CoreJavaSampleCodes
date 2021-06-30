/*Note: There are several ways by which we can add values to ArrayList:
	  1. using the normal add() method
	  2. using Arrays.asList() method
	  3. using Collections.nCopies(count, object) method
	  4. using Collections.addAll() method 
*/
package com.java.Collections;
import java.util.ArrayList;

public class add_method_ArrayList {
	public static void main(String[] args) {
		
//	Declare a Generic Array - String
		ArrayList<String> strArr=new ArrayList<String>();
		
//	Initialize values using the normal add() method
		strArr.add("Arun");
		strArr.add("Lucky");
		strArr.add("Durga");
		
		System.out.println("Initializing Values to ArrayList Using normal add() method");
		
//	Print the ArrayList
		for(String s: strArr) {
			System.out.println("String Array Values are: "+ s);
		}
		
//	Declare a Generic Array - String
		ArrayList<Integer> arrInt=new ArrayList<Integer>();
		arrInt.add(20);
		arrInt.add(40);
		arrInt.add(20);
		arrInt.add(60);
		
//	Print the Integer ArrayList
			for(int i: arrInt) {
				System.out.println("Integer Array Values are: "+ i);
			}
			
//	Declare Generic Employee ArrayList
			ArrayList<Employee> empArr=new ArrayList<Employee>();
			empArr.add(new Employee("Praveen",24,"IT",'M'));
			empArr.add(new Employee("Ravee",24,"IT",'F'));
			empArr.add(new Employee("Darwin",24,"IT",'M'));
			
//	Print the Employee ArrayList
			for(Employee e: empArr) {
				System.out.println("Employee Name: "+ e.name+ " Age: "+e.age+ " Dept Name: "+ e.dept+" Gender: "+e.gender );
			}
	}

}


/*Note:
 * In this code we are initializing Students Object ArrayList
 * Collections.sort() method invokes compareTo() method*/
package com.java_Collections;

import java.util.*;

public class comparable_Arraylist_Demo {
	public static void main(String[] args)
	{
		
		//	Declare an ArrayList		
			ArrayList<StudentsComparable> al= new ArrayList<StudentsComparable>();
			al.add(new StudentsComparable("Praveen", 43));
			al.add(new StudentsComparable("Raju", 22));
			al.add(new StudentsComparable("Navin", 53));
			al.add(new StudentsComparable("Roja", 33));

		//	Print ArrayList before sorting
			System.out.println("Printing ArrayList before sorting");
			for(StudentsComparable st: al)
				System.out.println("Name " + st.Name + "Age " + st.age );
			
//			Collections.sort(al);
			
		//	Print ArrayList after sorting
			System.out.println("Printing ArrayList after sorting");
			for(StudentsComparable st: al)
			System.out.println("Name " + st.Name + "Age " + st.age );
	}
	
}
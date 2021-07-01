/* Notes:
 * Comparable is an Interface and part of java.lang package
 * Comparable implements compareTo(Object obj) method 
 * Comparable is used for Single Sorting Sequence in a Collection object
 * Collections.sort(List) method will invoke compareTo() method
 */
package com.java.CollectionsCode;
import java.lang.Comparable;
public class StudentsComparable  implements Comparable<StudentsComparable>
{
	String Name;
	int age;
	
	StudentsComparable(String Name, int age){
		this.Name=Name;
		this.age=age;
	}
	
//	Sorting mechanism
	public int compareTo(StudentsComparable st) {
		if(age==st.age) {
			return 0;
		}
		else if(age> st.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}

/* Notes:
 * Comparator is an Interface and part of java.util package
 * Comparator implements compares(Object obj1, Object obj2) method 
 * Comparable is used for Multiple Sorting Sequence in a Collection object 
 * Collections.sort(List, Comparator) method will invoke compares() method
*/
package com.java.CollectionsCode;
import java.util.Comparator;
public class StudentsComparator implements Comparator<StudentsComparator>
{
	String Name;
	int age;
	StudentsComparator(String Name, int age){
		this.Name=Name;
		this.age=age;
	}
	
//	Sorting mechanism for String Name
	public int compare(StudentsComparator obj1, StudentsComparator obj2) {
		String s1=obj1.Name;
		int length= obj2.Name.compareTo(s1);
				
		if (length==0)
			return 0;
		else if (length>0)
			return -1;
		else 
			return 1;
	}
}

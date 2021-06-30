/* Cursors fetch the objects one by one from the Collection Object.
There are 3 types of Cursors in Java
1. Enumeration (Applicable only for legacy Classes)
2. Iterator - Forward Directional universal cursor
3. ListIterator( bi-directional - applicable for List Collection object  
*/
package com.java.Collections;
import java.util.*;
public class cursors_Demo {
	static	int var,var1,var2;
	public static void main(String[] args) {

// 		Declare a Vector
		Vector<Integer> v = new Vector<Integer>();
		
//		Declare an ArrayList
		ArrayList<Integer> aL=new ArrayList<Integer>();
		ArrayList<Integer> aL1=new ArrayList<Integer>();
		
//		Adding values to the vector & ArrayList
		for(int i=0;i<=6;i++) {
			v.add(i);
			aL.add(i);
			aL1.add(i);
		}	
		
//		Declare a Enumeration cursor for Vector
		Enumeration<Integer> e = v.elements();
		System.out.println("Enumeration Cursor");
			while(e.hasMoreElements()) {
			var =(Integer)e.nextElement();
			if(var%2==0) {
				System.out.println("Even values of vector are: " + var);
			}
		}
		System.out.println("Complete vector collection values are: " + v);
		
//		Declare an Iterator cursor
		Iterator<Integer> itr = aL.iterator();
		System.out.println("Iterator Cursor");
		
		while(itr.hasNext()) {
			var1 = (Integer)itr.next();
			if(var1%2==0) {
				System.out.println("Even Values of ArrayList are: "+ var1);
			}
			else {
				itr.remove();
			}
		}
		System.out.println("Complete ArrayList collection after removing odd values are: "+ aL);
		
//		Declare a ListIterator cursor
		ListIterator<Integer> lstITR= aL1.listIterator();
		
		System.out.println("ListIterator Cursor");
		while(lstITR.hasNext()) {
			var2=lstITR.next();
			if(var2%2==0) {
				System.out.println("Even values of ArrayList are: "+var2);
			}
			else {
				lstITR.set(var2);
//				System.out.println("New values of ArrayList are: "+var2);
			}
		}
		lstITR.add(10);
		System.out.println("Complete ArrayList collection values are: "+ aL1);
	}

}

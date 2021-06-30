
/*Note: This example is to show different methods available in ArrayList
1. add() method
2. addAll() method
3. collections.reverseOrder() method
4. clear() method
5. clone() method
6. get() method
7. remove() method
8. sort() method
9. size() method  
*/
package com.java.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class diff_methods_ArrayList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	//Declare a String ArrayList
		ArrayList<String> strArrLst=new ArrayList<String>();
		ArrayList<String> strArrLst1=new ArrayList<String>();
		ArrayList<String> strArrLstClone=new ArrayList<String>();
		
	//Initialize First ArrayList
		strArrLst.add("Praveen");
		strArrLst.add("Zeeba");
		strArrLst.add("Navin");
		strArrLst.add("Vydehi");
		strArrLst.add("Pradeep");
		
		
	//Initialize Second ArrayList
		strArrLst1.add("Prashant");
		strArrLst1.add("Kishore");
		strArrLst1.add("Atravanam");
			
	//To add one collection object into another collection
		strArrLst.addAll(strArrLst1);
			System.out.println("\n add one collection object into another collection using addAll() method");
			displayArray(strArrLst);
			
	//To Clone the ArrayList
			strArrLstClone=(ArrayList<String>) strArrLst.clone();	
			
	//Remove and get value from first ArrayList
		strArrLst.remove(2);
		String Str =strArrLst.get(1);
		String Str1=(String)strArrLst.get(2);
		System.out.println("\n String Get value at Index values: "+ Str +"\t"+ Str1);
		
	//Sort the ArrayList in Ascending Order
		System.out.println("\n Sort the ArrayList in Ascending Order");
		Collections.sort(strArrLst);
		displayArray(strArrLst); //	Call Print ArrayList method
		
	//Sort the ArrayList in Descending order
		System.out.println("\n Sort the ArrayList in Descending Order");
		strArrLst.sort(Collections.reverseOrder());
		displayArray(strArrLst); //	Call Print ArrayList method

		
	//Clear the ArrayList and print the same
		strArrLst.clear();
		displayArray(strArrLst); 
		
	//Print the cloned ArrayList
		System.out.println("\n Print the Cloned ArrayList");
		displayArray(strArrLstClone);
		
	}


	//Method to print ArrayList
		static void displayArray(ArrayList<String> arrLst) {
		//	Print the ArrayList values with For-Each Loop
			System.out.println("Size of ArrayList is "+ arrLst.size());
			if(arrLst.size()>0){
//				For-Each Loop Syntax: for(data-type variable: array | Collection)
				for(String str:arrLst) {
					System.out.println("String ArrayList values before merging are: "+ str);
				}
			}
			else {
				System.out.println("String ArrayList is empty");
			}
	}
	

}

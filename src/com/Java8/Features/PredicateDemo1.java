/* Predicate is a Predefined Functional Interface
 * Predicate (I) is used for conditional checking
 * Predicate (I) - Takes a single input argument 
 * Predicate (I) - always return a boolean
 */
package com.Java8.Features;
import java.util.function.Predicate;
public class PredicateDemo1 {
	public static void main(String[] args) {

//		Define a predicate Functional Interface
		Predicate<String> p = s -> s.length()>7;
		
//		Declare a String
		String[] s = {"Praveen","Vydehi","Udbhav","Aprameya"};
		for(String s1: s) {
//			test(T) is the only method in Predicate Interface
			if(p.test(s1)) {
				System.out.println("String values : "+ s1);		
			}
		}
	}
}
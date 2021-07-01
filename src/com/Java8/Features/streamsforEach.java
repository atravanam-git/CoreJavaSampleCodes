/*forEach() is a method NOT a loop
 * forEach(Consumer -> Lambda expression) 
 * Integer[] i :: new - creates integer object 
 * Employee :: new - will create sample object
 */
package com.Java8.Features;
import java.util.*;
import java.util.function.*;
public class streamsforEach {
public static void main(String[] args) {
		
//		Create Integer ArrayList
		ArrayList <Integer> aL = new ArrayList<Integer>();
		aL.add(325);
		aL.add(215);
		aL.add(253);
		aL.add(425);
		aL.add(325);
		aL.add(125);
		
//		Create a Consumer functional interface method
		Consumer<Integer> con = i -> {
			i= i-100;
			System.out.println(i);
		};
		
//		Create a Consumer functional interface method
		Consumer<Integer> conPrint = i -> {
			System.out.println(i);
		};
		
//		Creating a stream by calling forEach(Consumer) method returns void
		System.out.println("Original List Values");
		aL.stream().forEach(conPrint);
		
		System.out.println("Modified List Values");
		aL.stream().forEach(con);
	}

}

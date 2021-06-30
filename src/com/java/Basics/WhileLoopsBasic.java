package com.java.Basics;

public class WhileLoopsBasic {
public static void main(String[] args) {
		
		// printing values from 1 to 10 using the WHILE LOOP
		// Note: While loop can go into infinite loop if not properly incremented or decremented.
		
		int i=1;
		
		while(i<=10) {
		System.out.println("Printing values for variable i: "+i);
		i=i+1;
		}
		System.out.println("Loop-1 Ended");
		
		int j=1;
		while(j<=10) {
		System.out.println("Printing values for variable j: "+j);
		j= j+1; // Pre increment
	   // j=j++ // Post increment will lead to inifinite loop;
	
		}
		System.out.println("Loop-2 Ended");
	}

}

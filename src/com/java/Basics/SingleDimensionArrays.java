package com.java.Basics;

public class SingleDimensionArrays {
	public static void main(String[] args) {

		int i;
		// Integer Array declaration
		int x[] = new int[4];
		x[0]=12;
		x[1]=13;
		x[2]=14;
		// x[3]="Hello"; Arrays cannot take different data types
		x[3]=15;
		
		//post fix example
		for(i=0; i<x.length;i++) {
			
			System.out.println("Post-Increment Element and its Value: "+i+"\t"+x[i]);
		}

		System.out.println("\n"); 
				for(i=0; i<x.length;++i) {
					System.out.println("Pre-Increment Element and its Value: "+i+"\t"+ x[i]);
				}
		
		// Object arrays can take different data types
				Object obj[] = new Object[4];
				obj[0]="Praveen";
				obj[1]=40;
				obj[2]='M';
				obj[3]=23.54;
				System.out.println("\n"); // prints new line
				System.out.println("Printing Object Array Type: Name, Age, Gender and weight");
				for(i=0; i<obj.length;++i) {
					System.out.println(obj[i]);
				}
	}
}

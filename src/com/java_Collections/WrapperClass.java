package com.java_Collections;

public class WrapperClass {
	// Wrapper Class is used for Data type conversions.
	
			public static void main(String[] args) {
			
				String val1="100";
				String val2="200";
				String val3="200.25";
				System.out.println("String to integer conversion ");
				System.out.println("Before Wrapper Class Parsing: "+val1+val2+val3);
				
				// String to integer conversion
				int j= Integer.parseInt(val1);
				int k= Integer.parseInt(val2);
				System.out.println("After Conversion Class Parsing: ");
				System.out.println(j+k);
				
				//String to float conversion
				System.out.println("String to float conversion ");
				double m = Double.parseDouble(val3);
				System.out.println(j+k+m);	
			}

}

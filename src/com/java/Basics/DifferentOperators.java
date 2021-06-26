package com.java.Basics;

/* Different types of operators in Java
 * 1. Unary Operator 
 * 2. Binary Operator
 * 3. Ternary or Conditional Operator
 * 4. Bitwise Operator */

public class DifferentOperators {

	public static void main(String[] args) {
		int a=10, b=20, c;
		
//		Unary Operator
		a++;
		b--;
		
//		Binary Operator
		c=a+b;
		
//		Ternary or Conditional Operator  
		int d = (a > b) ? 5 :40;
		
		System.out.println("Unary operator a++ value "+ a);
		System.out.println("Unary operator b-- value "+ b);
		System.out.println("Binary operator c value "+ c);
		System.out.println("Ternary operator ?: d value "+ d);
		
//		Bitwise Operator ( &. \, ^)
		if(a>b & a>c) {
			System.out.println("a is > than b and c "+a);
		}
		else if (b>a & b>c) {
			System.out.println("b is > than a and c "+b);
		}
		else if (c>a & c>b) {
			System.out.println("c is > than a and b "+c);
		}
		else {
			System.out.println("a,b and c are equal values");	
		}

	}

}

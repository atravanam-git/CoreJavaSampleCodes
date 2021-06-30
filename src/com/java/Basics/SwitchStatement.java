package com.java.Basics;

public class SwitchStatement {
	public static void main(String[] args) {
		int z;
		// Method Calling Example using Switch Statement
		System.out.println("I am in Main method");
		// Since you are calling a Non-Static method from Static and it is referencing to
		// different memory space you must call the method by object reference of the class
		SwitchStatement obj=new SwitchStatement();
		z= obj.calcOperation(10, 5, "+");
		System.out.println(z);
	}
	
	public int calcOperation(int x, int y, String opr) {
		System.out.println("I am in calcOperation method");
		switch (opr){
		case "+": 
			System.out.println("Addition Operation");
			return x+y;
			
		case "-":
			return x-y;
			
		case "*":
			return x*y;
			
		default:
			return x/y;
			
		}	
	}

}

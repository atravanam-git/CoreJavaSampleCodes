package com.java.Basics;

public class IfElseConditions {
	public static void main(String[] args) {
		int x;
		int y;
		x=18; y=18;
		
		if (x> y)
		{
			System.out.println("X is Greater than Y");
			System.out.println("Value of X: "+ x);
			System.out.println("Value of Y: "+ y);
		}
		else if(x==y)
		{
			System.out.println("X is Equal to Y");
			System.out.println("Value of X: "+ x);
			System.out.println("Value of Y: "+ y);
		}
		else 
		{
			System.out.println("X is Less than Y");
			System.out.println("Value of X: "+ x);
			System.out.println("Value of Y: "+ y);
		}

			
	}

}

package com.java.Basics;

public class StaticVsNonStatic {
//	Non-Static Global Variables declaration
	int nsglobalAge = 43;
	String nsglobalName="Arjun";
	double nsglobalWeight=93.55;
	
//	Static variable declaration with the keyword static.
	static int age=39;
	static double weight=75.45;
	static String name="Kunti"; // All keywords should be in small letters.
	
	public static void main(String[] args) {
		
// Declare Class object reference name obj
		StaticVsNonStatic Obj= new StaticVsNonStatic();
		
// Print Non Static Variables
		System.out.println("Printing Non Static variables via ClassName Objec Reference Name:");
		System.out.println("Non Static Varaible Name: "+ Obj.nsglobalName);
		System.out.println("Not Static Varaible age: "+ Obj.nsglobalAge);
		System.out.println("Not Static Varaible weight: "+ Obj.nsglobalWeight);
		System.out.println("\n");
		
//	Calling Non-Static Method via Class Object Reference Name.
		Obj.PrintStaticVariables();
		
//		Calling Static Method by two ways -->  
// 		1. Directly Calling the method and
//		2. Calling by ClassName.Method Name
		System.out.println("Call to Static method directly");
		PrintNonStaticVariables();  
		System.out.println("Call to Static method via class name");
		StaticVsNonStatic.PrintNonStaticVariables(); 
		
	}
	
	public void PrintStaticVariables() {
//	Two ways of calling Static variables:
//	1. Call all Static variables via ClassNam
//	2. You can call Static Variable directly

//		call Static Variable by class name
		System.out.println("Printing All Static variables via ClassName");
		System.out.println("Static Varaible Name: "+ StaticVsNonStatic.name);
		System.out.println("Static Varaible age: "+ StaticVsNonStatic.age);
		System.out.println("Static Varaible weight: "+ StaticVsNonStatic.weight);
		System.out.println("\n");

//	call Static Variable directly
		System.out.println("Printing All Static variables by direct call");
		System.out.println("Static Varaible Name: "+name);
		System.out.println("Stic Variable Age is "+age);
		System.out.println("Static Varaible weight: "+weight);
		System.out.println("\n");
	}
	
	public static void PrintNonStaticVariables() {
//		The below call will give raise to the following exception "Object Cannot be resolved.
//		System.out.println("Non Static Varaible Name: " + Obj.nsglobalName);
		System.out.println(" Hello! Non Static method called");
		
	}
}

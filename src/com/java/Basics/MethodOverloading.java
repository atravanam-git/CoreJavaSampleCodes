package com.java.Basics;

public class MethodOverloading {
	public static void main(String[] args) {
// 		Methods cannot have same names
//		Method cannot be defined under another method
//		However we can have same method names with different parameters and different data types within the same class.
		
//		Return Type Variable declaration
		int retTyp;
		String strTyp;
		
//		Class Object Reference funcObj Creation
		MethodOverloading funcObj = new MethodOverloading();
		
//		Sum Method Calling
		retTyp=funcObj.Sum(10, 5);
		System.out.println(retTyp);
		
//		Sum Method Calling
		strTyp=funcObj.Sum("Praveen", 43);
		System.out.println(strTyp);
		
//		Sum Method Calling
		retTyp=funcObj.Sum(5, 6, 7);
		System.out.println(retTyp);
	}

	public int Sum(int a, int b) {
		System.out.println("Sum Method with 2 integer types has been called");
		return a+b;
	}
	
	public int Sum(int a, int b, int c) {
		System.out.println("Sum Method with 3 integer types has been called");
		return a+b+c;
	}
	
	public String Sum(String str, int age) {
		System.out.println("Sum Method with String & Int data types has been called");
		return str+age;
	}

}

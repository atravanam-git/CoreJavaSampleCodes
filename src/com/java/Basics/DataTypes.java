package com.java.Basics;

/* Different data types:
 *  1. Integer
 *  2. Double
 *  3. Character
 *  4. Boolean are called PRIMITIVE DATA TYPE 
 *  5. String is a Class and not data type */

public class DataTypes {

public static void main(String[] args) {
// integer data types can take only integers and not decimal or string	
	int i;
	i=10;
	System.out.println("Integer value of i is "+i);
	
	i=-10;
	System.out.println(i);
	// int i=10.5;// two error 1. duplicate variable declaration and 2. type mismatch error
	
	int j='i'; // displays ASCII value
	System.out.println("Integer value of j=i is "+j);
	
	int k=6/2;
	System.out.println("Integer value of k=x/2 is " +k);
	
// double data types can take all decimals
	double d=1.0;
	System.out.println("double value of d is "+d);
	
	d=-1.23;
	System.out.println("double value of d is "+d);
	
	d='i'; // displays ASCI value
	System.out.println("double value of d='i' is "+d);
	
// character data types
	char c='a';
//	char c="a"; cannot give double quotes in character data type
	System.out.println("charecter c is "+c);
	c='$';
	System.out.println("character c is "+c);
	
// Boolean data type holds only true or false values
	boolean a=true;
	System.out.println("Boolean value of b is "+a);
	
	boolean b=false;
	System.out.println("Boolean value of b is "+b);
	
// string data types - 
// Note: String is a class and not a data type
//	string str="Praveen" // throws an error since string is a class and it cannot begin with small letters
	String str="praveen";
	System.out.println("String value is " +str);
	str="prashant";
	str="";
	System.out.println("String value is blank now " +str);
	
}

}


package com.java_Collections;
public class enum_with_Anonymousclass {
	public static void main(String[] args) {
//	fetch the values of colors enum
	ColorsEnum[] c = ColorsEnum.values();
//	for-Each loop
//	Call the info() method in the ColorEnum
		for(ColorsEnum c1: c) 
		{
			c1.info();	
		}
		}

}

	

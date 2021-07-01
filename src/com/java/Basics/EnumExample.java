//We cannot create Enum object explicitly with New() keyword
//Enum Construtors cannot be called explicitly since enum-types cannot be initiated
package com.java.Basics;

public class EnumExample {
	public static void main(String[] args) {

//		Constructors in the Enum will be called
		AnimalEnum[] strArray = AnimalEnum.values();
		
//		Syntax: for(data-type variable: array | Collection)
		for(AnimalEnum obj: strArray) {
			System.out.println("AnimalEnum values are : "+ obj+"    "+ obj.getSpeed());	
		}	
		
//		We can use Enum in Switch Statement too
		AnimalEnum e = AnimalEnum.CHEETAH;
		switch (e.toString()) {
		case "CHEETAH":
			System.out.println("Cheetah");
			break;
		case "LION":
			System.out.println("LION");
			break;
		default:
			System.out.println("Not present in AnimalEnum");
		}
	}

}

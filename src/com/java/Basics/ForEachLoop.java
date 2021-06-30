package com.java.Basics;

public class ForEachLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {21,34,12,45,23,10};
		int arr[]=new int[5];
		arr[0]=19;
		arr[1]=17;
		arr[2]=32;
		arr[3]=14;
		arr[4]=12;
		System.out.println("Length of the Array arr is: "+ arr.length);
//		For-Each Loop 
		for(int index:arr) {
			System.out.println("Value of arr is: "+index);
		}
		System.out.println("\n");
//		For-Each Loop
		for(int index:arr1) {
			System.out.println("Value of arr1 is: "+index);
		}
		
	}


}

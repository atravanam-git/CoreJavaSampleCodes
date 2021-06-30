package com.java.Basics;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		// Declaring two dimensional arrays
		int x[][] = new int[3][3];
		int i,j,a,b;
		a=2;b=2;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				x[i][j]= a*b;
				b++;
				System.out.println("2 DIM Array Values "+x[i][j]);
			}
		}
	}
}

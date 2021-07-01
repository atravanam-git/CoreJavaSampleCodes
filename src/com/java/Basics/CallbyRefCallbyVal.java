package com.java.Basics;

public class CallbyRefCallbyVal {
	int x=5;
	int y=6;
	
	public static void main(String[] args) {

//		Creating Class Object reference name
		CallbyRefCallbyVal Obj=new CallbyRefCallbyVal();

//		Calling method by Value
		int z= Obj.CallbyVal(Obj.x, Obj.y);
				System.out.println("Value of z: "+z);

//		Calling method by Reference
		Object swap=Obj.CallbyRefSwap(Obj);
		System.out.println("Value of Swap: "+swap);
				

	}
	
	public int CallbyVal(int x, int y) {
		System.out.println("From the CallbyVal Method: value x is "+x);
		System.out.println("From the CallbyVal Method: value y is  "+y);
		x=x+y;
		return x;
	}
	
	public Object CallbyRefSwap(CallbyRefCallbyVal t) {
		int swap;
		swap = t.x;
		x=y;
		y=swap;
		
		System.out.println("From the CallbyRef Method: value x is  "+x);
		System.out.println("From the CallbyRef Method: value y is  "+y);
		return x+y;
	
	}

}

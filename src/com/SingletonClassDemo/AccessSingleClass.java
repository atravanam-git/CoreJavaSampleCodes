package com.SingletonClassDemo;

public class AccessSingleClass {

	public static void main(String[] args)
	{
//		object2 is assigned getInstance() method return type 
//		which is an instance of SingletonCls
		SingletonCls object2 = SingletonCls.getInstance();
		object2.showMessage();
//		The below code of crating the instance via a constructor is not possible
//		SingletonCls object1=new SingletonCls();
		

	}

}

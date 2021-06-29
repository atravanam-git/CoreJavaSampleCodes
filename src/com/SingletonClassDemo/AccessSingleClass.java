package com.SingletonClassDemo;

public class AccessSingleClass {

	public static void main(String[] args)
	{
//		object2 is assignes getinstance method
		SingletonCls object2 = SingletonCls.getInstance();
		object2.showMessage();

	}

}

package com.SingletonClassDemo;

public class SingletonCls {
//	Create an object of SingletonCls
	private static SingletonCls instance= new SingletonCls();
	
//	Create a private constructor
	private SingletonCls()
	{
		//Default constructor
	}

//	Create a public function that returns an instance of the class
	public static SingletonCls getInstance()
	{
		return instance;
	}

//	Ordinary public function which prints Hello World
	public void showMessage()
	{
		System.out.println("Hello World");
		
	}
	
}

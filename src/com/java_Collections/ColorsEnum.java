//This enum has group of Constants with anonymous inner class
package com.java_Collections;
public enum ColorsEnum {
	BLUE, RED{
		public void info() {
			System.out.println("Red is Dangerous color");
		}
	}, GREEN;
	public void info() {
		System.out.println("This is a Universal Color");
	}

}


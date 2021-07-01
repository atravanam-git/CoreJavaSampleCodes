package com.java.Basics;

public enum AnimalEnum {
	LION(70), TIGER(75), CHEETAH(90), LEAPORD;
	
	int speed;
	
//	Constructors with Zero Args
	AnimalEnum() {
		this.speed=65;
	}
	
//	Constructors with Args
	AnimalEnum(int speed){
		this.speed=speed;
	}
	
//	Get Speed Method
	int getSpeed(){
		return speed;
	}

}

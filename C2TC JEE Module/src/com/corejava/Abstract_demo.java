package com.corejava;


public class Abstract_demo {

	public static void main(String[] args) {
		Scooty pepplus=new Scooty();
		pepplus.numberOfWheels();

	}

}
 abstract class Vehicle
 {
	 abstract void numberOfWheels(); //if there are more than one abstract class then 
 }                                 // we have to used abstract in the child class if we want to avoid any abstract METHOD IN PARENT CLASS..
 class Scooty extends Vehicle // we can make any no. of child class to initialize abstract class.
 
 {

	@Override
	void numberOfWheels() {
		{
			System.out.println(2); //we can create object in abstract class.
		} //so to initialize a abstract class we use extends and override a body.
		
	}
	 
 }
package com.corejava;


public class Method_overriding {

	public static void main(String[] args) {
		
	}

}
 class Parent
 {
	 void Property() 
	 {
		 System.out.println("house,bunglow etc");
	 }
	 void marry() //original method
	 {
		 System.out.println("lata");
	 }
 }
 class Child extends Parent
 {
	 void marry() // for new implementation rather than parent class.
	 {
		 System.out.println("Kriti Sanon");
	 }
 }
package com.corejava;


public class Static_block {

	public static void main(String[] args) {
		System.out.println("hello M11");
	}
  
	static //Static block will always be executed first and before main method.
	{
		System.out.println("Good night");
	}
	
	static 
	{
		System.out.println("Good Morning");
	}
	
	static 
	{
		System.out.println("Good evening");
	}
	

	
}
//it will print in top to bottom Sequence.
package com.corejava;

//this is called method overloading coz the method has same name but different parameters.


public class Method_overloading {

	public void m() //method signature cannot be same.(method name+parameters) 
	{
		System.out.println("No Argument method");
	}
	public void m(int i)
	{
		System.out.println("Integer Argument method");
	}
	public void m(double d)
	{
		System.out.println("Double  Argument method");
	}
	
	public static void main(String[] args) {
		Method_overloading obj=new Method_overloading();
		
		obj.m();  //compiler is looking for exact match so its compile time polymorphism
		obj.m(2);
		obj.m(8.355);
		
		obj.m('a'); //Automatic promotion is done when parameters in not available into higher order.
		obj.m(2);
		obj.m(101);
		obj.m(5.6f);
		
	}
	
}


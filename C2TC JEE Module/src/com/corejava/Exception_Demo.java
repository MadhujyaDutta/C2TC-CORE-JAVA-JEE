package com.corejava;


public class Exception_Demo {

	public static void main(String[] args) {
	m1();
	}
     
	static void m1()
	{
		m2();
	}
	 static void m2()
	 {
		 System.out.println(10/0);  //it is good for a compiler but exception in real world so runtime world.
	 }
}


//methods the store in Stack memory of JVM.
// jvm ask the method for any active exception handler, it its not there then they are popped out of the stack
//then goes to main method, if not there all get pops out.
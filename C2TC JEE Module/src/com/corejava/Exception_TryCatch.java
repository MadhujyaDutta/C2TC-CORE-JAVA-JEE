package com.corejava;


public class Exception_TryCatch {

	public static void main(String[] args) {
		System.out.println("M11 is best");
		
		try
		{
			System.out.println(20/0);
		}
		
		catch(ArithmeticException e) //executing the required Exception handler.
		{
			System.out.println("Dont divide by Zero");
		    
			System.out.println(2/2);
			
			System.out.println(e); //e is the object of inbuilt exception class.
		}
        
		System.out.println("M11 is dirty");
	}

}

package com.corejava;


public class Exception_TryCatchFinally {

	public static void main(String[] args) {
	  int[] arr = new int[4];
	  
	  try {
		  int i = arr[4]; //index 4 is not present
		  System.out.println("Inside try block");
	  }
      catch(ArrayIndexOutOfBoundsException e)
	  {
    	  System.out.println("Exception caught"); //handling code
	  }
	  finally
	  {
		  System.out.println("Finally block executed");
	  }
	  System.out.println("Outside try-catch-finally block");
	}

}

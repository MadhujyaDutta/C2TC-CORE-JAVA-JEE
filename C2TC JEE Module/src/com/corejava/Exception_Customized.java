package com.corejava;
import java.util.*;
public class Exception_Customized {

	public static void main(String[] args) throws CantVote {
		
		int age;
		 System.out.println("Enter your Age : ");
		  Scanner obj = new Scanner(System.in);
		   age = obj.nextInt();
		  
		   if(age<18)
		   {  //throwable is root class for exception 
			   throw new CantVote("You cannot cast your Vote as Age is less than 18");
		   }
		   else {
			   System.out.println("You can Vote");
		   }
	}

}
//this now become unchecked 
//class CantVote extends RuntimeException //to make it an exception class we should extends the any inbuilt exception like this. 
//{
	//CantVote(String msg)
	//{
		//super(msg); //it is used to print a long exception message.
//	}
//}

//this now become checked 
class CantVote extends Exception //to make it an exception class we should extends the any inbuilt exception like this. 
{
	CantVote(String msg)
	{
		super(msg); //it is used to print a long exception message.
	}
}

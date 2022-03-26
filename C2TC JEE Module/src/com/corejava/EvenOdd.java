package com.corejava;
import java.util.Scanner;
public class EvenOdd {
	

	public static void main(String[] args) {
      int number,remainder;
       System.out.println("Please enter an integer no:");
         Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
              scan.close();
         
          remainder = number % 2;
          
          if(remainder == 0)
        	   System.out.println(number+" is a even number");
          else
        	  System.out.println(number+" is an odd number");

	}

}

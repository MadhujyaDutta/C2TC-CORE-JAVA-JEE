package com.assignments;

import java.util.*;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		
	     {
	        Scanner obj=new Scanner(System.in);
	        int n;
	        System.out.println("Enter the number: ");
	        n=obj.nextInt();    
	        
	        int sum=0;   
	        for(int i=1; i<=n;i++)
	        {
	            sum=sum+i;
	        }
	        System.out.println("The sum of natural numbers is "+sum);
	     }
	}
}

	
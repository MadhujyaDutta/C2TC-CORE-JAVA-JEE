package com.assignments;

public class ReversePyramid {


	public static void main(String[] args) {
		int n=6;  
		for (int i= 0;i<=n-1;i++)  
	{  
			for (int j=0; j<=i; j++)  
		{  
		  System.out.print(" ");  //i & j are 0 so 0 spaces are print.
	}  
				for (int k=0; k<=n-1-i; k++)  //as i=0 so total 6 stars are printed simultaneously
		{  
		     System.out.print("*" + " ");  
		}  
					System.out.println();  
		}  
	}  
}  

	

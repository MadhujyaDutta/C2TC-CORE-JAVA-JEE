package com.assignments;

public class RightTriangleStar {

	public static void main(String[] args) {
		   int n=8;
			
		   
			 for( int i=1;i<=n; i++)//outer loop
			   {
				for(int j=1; j<=i; j++)//inner loop
				{
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}

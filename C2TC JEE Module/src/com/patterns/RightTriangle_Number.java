package com.patterns;

public class RightTriangle_Number {

	public static void main(String[] args) {
	
			int n=8;
			for(int i=n;i>=1;i--) // we have used i-- because we have to print greater to smaller, like 8 to 1
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}

		}

	}

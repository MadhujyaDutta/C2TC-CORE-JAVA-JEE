package com.patterns;

public class ZeroOne_Triangle {

	public static void main(String[] args) {
		int n=8;
			
			for( int i=1;i<=n; i++)//outer loop
			{
				for(int j=1; j<=i; j++)//inner loop
				{ int sum= i + j;
				if(sum%2==0) {
					System.out.print("1 ");
				} else {
				System.out.print("0 ");
				
			}
		}
				System.out.println();

	}
	}
	}
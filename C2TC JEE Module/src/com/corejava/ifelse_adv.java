package com.corejava;


import java.util.*;
public class ifelse_adv {

	public static void main(String[] args) {
		Scanner code = new Scanner(System.in);
		int a = code.nextInt();
		int b = code.nextInt();
		
		if(a==b)
		{ 
			System.out.println("Equal");
		}
		else 
		{
			if(a>b)
			{
				System.out.println("a is greater");
			}
			else 
			{
				System.out.println("a is lesser");
			}
		}

	}

}

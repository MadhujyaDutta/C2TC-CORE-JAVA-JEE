package com.corejava;


public class Switch {

	public static void main(String[] args) {
		int x=10;
		switch(x)
		{
		case 'a': //numeric value of 'a' is 97 so a duplicate case error.
		System.out.println("a");
		break;
		
		case 97 :
		System.out.println("97");
		break;
		}

	}

}

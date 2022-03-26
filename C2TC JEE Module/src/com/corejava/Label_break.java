package com.corejava;


public class Label_break {

	public static void main(String[] args) {
		int x = 10;
		l:    //labelled block l
		{ 
			System.out.println("Login");
			
			if (x==10)
				break l;
			
			System.out.println("End");
		}  
		
		    System.out.println("Good Noon");
		
	}

}

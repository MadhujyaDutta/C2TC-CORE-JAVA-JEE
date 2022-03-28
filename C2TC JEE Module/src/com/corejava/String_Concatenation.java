package com.corejava;

public class String_Concatenation {

	public static void main(String[] args) {
	
		String firstName = "Madhujya";
		String lastName = "Dutta";
		String fullName = firstName + "@" + lastName; //concatenation means addition of two strings 
		  System.out.println(fullName.length());
		  
		  //charAt
		  for(int i =0;i<fullName.length(); i++) {
			  System.out.println(fullName.charAt(i)); //charAt is a keyword to print string by string 
		  }
		  
		  

	}

}

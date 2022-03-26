package com.corejava;

import java.util.Scanner;

public class Array_UserInput {

	public static void main(String[] args) {
	 Scanner obj = new Scanner(System.in);
	 int size = obj.nextInt();
	 
	 int[] numbers = new int[size];
	 
	
	 
	 //input : initialization of an array
	 for(int i=0; i<size; i++) {
		 numbers[i] = obj.nextInt();
	 }
	 
	 //output
	 for(int i=0; i<size; i++) {
		 System.out.print(numbers[i]+ " ");
	 }
	}

}

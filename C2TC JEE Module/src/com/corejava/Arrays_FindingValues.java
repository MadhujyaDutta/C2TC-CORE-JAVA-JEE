package com.corejava;

import java.util.Scanner;  //LINEAR SEARCH

public class Arrays_FindingValues {

	public static void main(String[] args) {
		

		 Scanner obj = new Scanner(System.in);
		 int size = obj.nextInt();
		 
		 int[] numbers = new int[size];
		 
		
		 
		 //input : initialization of an array
		 for(int i=0; i<size; i++) {
			 numbers[i] = obj.nextInt();
		 }
		 
		 int x = obj.nextInt(); // we are taking the value of X to find the value in array and print the index.
		 //output
		 for(int i=0; i<size; i++) {
			 if(numbers[i] == x) {
				 
			      System.out.println(" x found at index : "+ i);
		 }
		}
	}
	}

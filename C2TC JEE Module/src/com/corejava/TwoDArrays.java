package com.corejava;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String args[]) {
	

		Scanner obj = new Scanner(System.in);
	       int rows = obj.nextInt();
	       int cols = obj.nextInt();
	 
	       int[][] numbers = new int[rows][cols];
	 
	       //input
	       //rows
	       for(int i=0; i<rows; i++) {
	           //columns
	           for(int j=0; j<cols; j++) {
	               numbers[i][j] = obj.nextInt();
	           }
	       }
	 
	 
	       for(int i=0; i<rows; i++) {
	           for(int j=0; j<cols; j++) {
	                   System.out.print(numbers[i][j]+" ");
	               }
	               System.out.println();
	           }
	   }
}

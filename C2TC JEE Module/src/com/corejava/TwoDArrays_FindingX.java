package com.corejava;

import java.util.*;
public class TwoDArrays_FindingX {

	public static void main(String[] args) {
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
	 
	       int x = obj.nextInt();
	 
	       for(int i=0; i<rows; i++) {
	           for(int j=0; j<cols; j++) {
	               //compare with x
	               if(numbers[i][j] == x) {
	                   System.out.println("x found at location (" + i + "," + j + ")");
	               }
	           }
	       }
	 
	     
	 
	   }
	}

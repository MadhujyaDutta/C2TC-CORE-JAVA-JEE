package com.corejava;

import java.util.*;
public class SUMusingFOR {     //Sum of first n Natural no.

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		
		int i;
		int sum = 0;
		for( i = 0; i<=n; i++) {
			
			sum = sum + i;

	}
		System.out.println(sum);

}
}
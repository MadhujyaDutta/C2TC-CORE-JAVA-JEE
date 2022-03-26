package com.assignments;
import java.util.*;
public class ArmstrongNumber {

  public static void main(String[] args) {
		int n,arm=0,rem,c;
		System.out.print("Enter any Number: ");
		 
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		
       	c=n; //storing a raw n number
		
		while(n>0)
		{
			rem=n%10; //we will see the remainder & proceed to arm
			arm = (rem*rem*rem) + arm;
            n=n/10;  		//our n value is the qoutent left.
		}
		if(c==arm)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not an Armstrong Number");

	}

}

package com.corejava;

public class Flowcontrol_Assi {

	public static void main(String[] args) {
	int x=0;
	do
	{
		x++;
		System.out.println(x);
		
		if(++x<5) // when we use continue with do while statement then its pops out to while
			continue;
		
		x++;
		System.out.println(x);
		
	} while(++x<10);
	

	}

}
/*if x becomes true in if barrier then its go the while barrier & 
if its true there then its return to do again and 
		repeat the process */
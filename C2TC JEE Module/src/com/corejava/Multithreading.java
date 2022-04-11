package com.corejava;

public class Multithreading {

	public static void main(String[] args) {
	
		
		MyThread obj = new MyThread();
		obj.start();  //we have to use start to strt it
		
		for(int i =0;i<10;i++)
		{
		System.out.println("myyyyyyy name");
		}
	}

}
//to make the class thread we have to use implements
//class MyThread implements Runnable
//{
	
//}

class MyThread extends Thread //this is also one way
{
	//override the run()
	public void run() 
	{
	
	for(int i =0;i<10;i++)
	
	{
		System.out.println("myyyyyyy");
		//Thread.yield(); //it says mains to print first
	}
}
}

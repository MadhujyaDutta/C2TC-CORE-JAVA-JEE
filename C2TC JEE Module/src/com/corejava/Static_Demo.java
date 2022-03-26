package com.corejava;

public class Static_Demo {
	
	
	String name;
	int adhar;
    static String vaccine= "covaxin"; // to make it class bound we use static keyword
    
    
    
    // we use static so that it is same for any no.. of people ie. 10000 people took covaxin.
    
    
    public Static_Demo(String name, int adhar) {
		
		this.name = name;
		this.adhar = adhar;
		
	}
    static void change() //we can chnge static values. 
    {
    	vaccine= "covishield";
    }

	void display()
    {
    	System.out.println(name+" "+adhar+" "+vaccine); // + is used for concadinating.
    }

	public static void main(String[] args) {
		Static_Demo.change(); // to call the updated information
		Static_Demo p1=new Static_Demo ("Gopi", 123456);
		Static_Demo p2=new Static_Demo ("Gopilakrishna", 155698556);
		
		p1.display();   // to display after using constructor.
		p2.display();
	}

}

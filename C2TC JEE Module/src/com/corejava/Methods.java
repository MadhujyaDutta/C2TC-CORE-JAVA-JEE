package com.corejava;

   public class Methods {

		int logic(int x, int y) { //main method is static so we use static method here
			int z;
			if(x>y) {
				z = x+y;
			}
			else {
				z = (x+y)*5;
			}
			return z; //it returns the program control to the caller of the method
		}
		
		public static void main(String[] args) {
			
	    int a = 6; //method values cannot changes values of main area
	    int b = 9;
	    int c;
	    //method invocation using object creation
	    Methods obj = new Methods();
	    c = obj.logic(a,b);
	    
	    int a1 = 8;
	    int b1 = 2;
	    int c1;
	    c1 = logic(a1, b1); //if its not static in method so it will not work as main method is static
	    
	    System.out.println(c);
	    System.out.println(c1);
	    
		}

	}

   
   // in case of arrays reference is passed, so the modification can be done using methods
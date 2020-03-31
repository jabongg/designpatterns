package com.learn;

/* This is a simple Java program. 
FileName : "HelloWorld.java". */
class HelloWorld 
{ 
	// Your program begins with a call to main(). 
	// Prints "Hello, World" to the terminal window. 
	public static void main(String args[]) 
	{ 
		System.out.println("Hello, World"); 
		gcd();
	} 
	
	
	public static  void gcd() {
        int n1 = 69, n2 = 15;
        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
    }
} 


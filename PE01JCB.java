/*
Name: Baguio, Janfred Clark J.
Section: BSIT 1DG1
Description: A program that determines if a number is odd or even.
*/

import java.util.*;

class PE01JCB {
    public static void main(String[] clrk) {
    	Scanner inpt = new Scanner(System.in);
	
		int num;

		System.out.print("Enter a number: ");
		num = inpt.nextInt();

		if (num % 2 == 0) 
	    	System.out.println("Even");
		else if (num % 2 != 0)
	    	System.out.println("Odd");
    }

}

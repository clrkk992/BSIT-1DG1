/*
Name: Baguio, Janfred Clark J.
Section: BSIT 1DG1
Description: A program that determines if a number is positive, negative, or zero.
*/

import java.util.*;

class PE02JCB {
    public static void main(String[] clrk) {
        Scanner inpt = new Scanner(System.in);
	
		int num;

		System.out.print("Enter a number: ");
		num = inpt.nextInt();
	
		if (num > 0) 
		    System.out.println("Positive");
		else if (num < 0)
		    System.out.println("Negative");
		else
		    System.out.println("Zero");
    }
}

/*
Name: Baguio, Janfred Clark J.
Section: BSIT 1DG1
Description: A program that determines which is the highest number among the 3 inputted numbers..
*/

import java.util.*;

class PE04JCB {
    public static void main(String[] clrk) {
        Scanner inpt = new Scanner(System.in);
	
		int n1, n2, n3;
	
		System.out.print("Enter 1st number: ");
		n1 = inpt.nextInt();
		System.out.print("Enter 2nd number: ");
		n2 = inpt.nextInt();
		System.out.print("Enter 3rd number: ");
		n3 = inpt.nextInt();
	
		if (n1 > n2 && n1 > n3) 
		    System.out.println(n1 + " is the highest among the 3 numbers.");
		else if (n2 > n1 && n2 > n3) 
		    System.out.println(n2 + " is the highest among the 3 numbers.");
		else if (n3 > n1 && n3 > n2) 
		    System.out.println(n3 + " is the highest among the 3 numbers.");
    }

}

/*
Name: Baguio, Janfred Clark J.
Section: BSIT 1DG1
Description: A program that determines which number is greater than, less than or if both numbers are equal.
*/

import java.util.*;

class PE03JCB {
    public static void main(String[] clrk) {
        Scanner inpt = new Scanner(System.in);
	
	int n1, n2;

	System.out.print("Enter 1st number: ");
	n1 = inpt.nextInt();
	System.out.print("Enter 2nd number: ");
	n2 = inpt.nextInt();

	if (n1 > n2) 
	    System.out.println(n1 + " is greater than " + n2);
	else if (n1 < n2)
	    System.out.println(n1 + " is less than " + n2);
	else
	    System.out.println(n1 + " is equal to " + n2);
    }
}
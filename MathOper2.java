import java.util.*;

class MathOper2 {
    static Scanner inpt = new Scanner(System.in);

    public static void main(String[] clrk) {
        int N1, N2, Sum, Diff, Prod, Quot, Rem;
	
	System.out.print("Enter first number: ");
	N1 = inpt.nextInt();
	System.out.print("Enter second number: ");
	N2 = inpt.nextInt();

	//Sum = N1 + N2;
    	System.out.println("Sum = " + Sum(N1, N2));

    	//Diff = N1 - N2;
    	System.out.println("Difference = " + Diff(N1, N2));

    	//Prod = N1 * N2;
    	System.out.println("Product = " + Prod(N1, N2));

    	//Quot = N1 / N2;
    	System.out.println("Quotient = " + Quot(N1, N2));

    	//Rem = N1 % N2;
    	System.out.println("Remainder = " + Rem(N1, N2));
    }

    static int Sum(int x, int y)   { return x + y; }

    static int Diff(int x, int y)  { return x - y; }

    static int Prod(int x, int y)  { return x * y; }

    static int Quot(int x, int y)  { return x / y; }

    static int Rem(int x, int y)   { return x % y; }
}
class MathOper3 {
    public MathOper3() {
        N1 = 10;
        N2 = 80;
    }

    public MathOper3(int x, int y) {
        N1 = x;
        N2 = y;
    }

    int N1=0, N2=0;

    int Sum()  { return N1 + N2; }
    int Diff() { return N1 - N2; }
    int Prod() { return N1 * N2; }
    int Quot() { return N1 / N2; }
    int Rem()  { return N1 % N2; }

    void dispSummary() {
        System.out.println("Sum = " + Sum());
    	System.out.println("Difference = " + Diff());
    	System.out.println("Product = " + Prod());
    	System.out.println("Quotient = " + Quot());
    	System.out.println("Remainder = " + Rem());
    }
}
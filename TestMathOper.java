class TestMathOper {
    public static void main(String[] clrk) {
        MathOper3 object1, object2;
    	object1 = new MathOper3();

    	System.out.println(object1.N1);
    	System.out.println(object1.N2);

 	object1.N1 = 15;
    	object1.N2 = 90;

    	System.out.println(object1.N1);
    	System.out.println(object1.N2);
	System.out.println();

    	object1.dispSummary();
	System.out.println();

    	object2 = new MathOper3(100, 23);
    	object2.dispSummary();
    }
}
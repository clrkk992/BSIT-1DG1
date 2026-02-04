import java.util.*;

class GradeAnalyzer {
    public static void main(String[] clrk) {
        Scanner inpt = new Scanner(System.in);

	int[] grades = new int[10];
	int sum=0, highest = grades[0];
	double average;

	System.out.println("Enter Grades: ");
	for (int i = 0; i < grades.length; i++) {
	    grades[i] = inpt.nextInt();

	    sum += grades[i];
	    if (grades[i] > highest)
	        highest = grades[i];
	}

	average = (double) sum / grades.length;
	System.out.println("Average Grade: " + average);
	System.out.println("Highest Grade: " + highest);
    }
}
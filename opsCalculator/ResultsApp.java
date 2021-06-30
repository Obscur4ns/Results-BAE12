package opsCalculator;

public class ResultsApp {

	public static void main(String[] args) {
		System.out.println("Your physics results:");
		System.out.println(Results.Physics);
		System.out.println("Your chemistry results:");
		System.out.println(Results.Chemistry);
		System.out.println("Your biology results:");
		System.out.println(Results.Biology);
		System.out.println("Your total marks are:");
		System.out.println(Results.totalMarks());
		System.out.println("Your average percentage is:");
		System.out.println(Results.resultsPercentage());
		System.out.println("Well done, you're forgettable!");

	}

}

package opsCalculator;

public class ResultsApp {

	public static void main(String[] args) {
		System.out.print("Your physics results: ");
		System.out.println(Results.Physics);
		System.out.print("Your chemistry results: ");
		System.out.println(Results.Chemistry);
		System.out.print("Your biology results: ");
		System.out.println(Results.Biology);
		System.out.print("Your total marks are: ");
		System.out.println(Results.totalMarks());
		System.out.print("Your average percentage is: ");
		System.out.print(Results.resultsPercentage());
		System.out.println("%");
		System.out.println(" ");
		if (Results.resultsPercentage() < 40)
			System.out.println("Well done, you're forgettable!");
		else if (Results.resultsPercentage() > 40)
			System.out.println("Well done, you're better than average!");

	}

}

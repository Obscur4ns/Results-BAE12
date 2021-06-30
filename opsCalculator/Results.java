package opsCalculator;

public class Results {
	public static int Physics = 100;
	public static int Chemistry = 120;
	public static int Biology = 90;
	public static int Total;
	public static double Percentage;

	public static int totalMarks() {
		Total = Physics + Chemistry + Biology;
		return Total;

	}

	public static double resultsPercentage() {
		Total = Physics + Chemistry + Biology;
		Percentage = (Total * 100) / 450.0;
		return Percentage;

	}

}

import java.io.*;
public class NumberAnalysisDemo {
	public static void main(String[] args) throws IOException {
		String file = "Numbers.txt";
		NumberAnalysis numFile = new NumberAnalysis(file);
		double low, high, total, average;
		low = numFile.getLow();
		high = numFile.getHigh();
		total = numFile.getTotal();
		average = numFile.getAverage();
		System.out.println("The lowest value in the file is " + low + ".");
		System.out.println("The highest value in the file is " + high + ".");
		System.out.printf("The total of all the values in the file is %.2f.\n", total);
		System.out.printf("The average of all the values in the file is %.2f.\n", average);
	}
}
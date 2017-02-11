import java.util.*;
public class RainCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] rain = new double[12];
		for(int i = 0; i < 12; i++) {
			System.out.print("Please enter the amount of rain for month " + (i+1) + ": ");
			rain[i] = scan.nextDouble();
			scan.nextLine();
			while(rain[i] < 0) {
				System.out.println("The amount of rainfall in a month cannot be less than zero.");
				System.out.print("Please enter the amount of rain for month " + (i+1) + ": ");
				rain[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
			Rainfall rainLog = new Rainfall(rain);
			double total; //for holding the total rainfall
			double average; //for holding the average amount of rainfall
			int mostMonth, leastMonth; //for holding the index numbers of the months with the most and least rain
			
			total = rainLog.totalRainfall();
			average = rainLog.averageRainfall();
			mostMonth = rainLog.mostRain();
			leastMonth = rainLog.leastRain();
			
			System.out.println("Over the past twelve months, you received a total of " + total + " inches of rainfall.");
			System.out.println("You received an average of " + average + " inches of rainfall per month.");
			System.out.println("The rainiest month was month number " + (mostMonth + 1) + ".");
			System.out.println("The month with the least rain was month number " + (leastMonth + 1) + ".");
	}
}
import java.util.*;
public class CountryPopulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//declaring the arrays for country names and population
		String[] countryName = new String[12];
		double[] countryPop = new double[12];
		
		//filling the arrays with user input
		for(int i = 0; i < 12; i++) {
			System.out.print("Enter the name of country number " + (i + 1) + ": ");
			countryName[i] = scan.nextLine();
			System.out.print("Enter the population of " + countryName[i] + ": ");
			countryPop[i] = scan.nextDouble();
			scan.nextLine();
			while(countryPop[i] < 0) {
				System.out.println("The population of " + countryName[i] + " cannot be a negative number.");
				System.out.print("Enter the population of " + countryName[i] + ": ");
				countryPop[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
		
		//printing out the contents of both arrays
		for(int index = 0; index < 12; index++) {
			System.out.print("The population of " + countryName[index] + " is ");
			System.out.printf("%,.0f", countryPop[index]);
			System.out.println();
		}
	}
}		
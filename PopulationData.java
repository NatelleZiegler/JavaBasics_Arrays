import java.io.*;
import java.util.*;
public class PopulationData {
	public static void main(String[] args) throws IOException{
		File popFile = new File("USPopulation.txt");
		Scanner inputFile = new Scanner(popFile);
		double[] popArray = new double[41];
		for(int i = 0; i < 41; i++) {
			popArray[i] = inputFile.nextDouble();
			if(i > 40) {
				inputFile.nextLine();
			}
		}
		inputFile.close();
		double avChange = averageChange(popArray);
		int indexGreatest = getGreatest(popArray);
		int indexSmallest = getLeast(popArray);
		
		System.out.println("The average change in population during this time period was " + avChange + ".");
		System.out.println("The greatest population change occurred in year " + (1950 + indexGreatest) + ".");
		System.out.println("The smallest population change occurred in year " + (1950 + indexSmallest) + ".");
	}
		
	/**
		The averageChange method determines the average annual change in population
		during the time period.
		
		@param population An array containing all the values for the midyear pop. in
		the United States from 1950 through 1990.
		@return avgChange The average annual change in population during the time period.
	*/
	
	public static double averageChange(double[] population) {
		double totalChange = 0;
		double avgChange = 0; //the average annual change in population during the time period
		for(int i = 40; i >= 0; i--) {
			if(i > 0) {
				double difference;
				difference = population[i] - population[i - 1];
				totalChange += difference;
			}
		}
		
		avgChange = totalChange / (population.length / 2);
		return avgChange;
	}
		
	/**
		The getGreatest method determines which year had the greatest increase in population.
		
		@param population An array containing all the values for the midyear pop. in
		the United States from 1950 through 1990.
		@return indexMaxChange The location in the population array of the year with the greatest
		change in population.
	*/
	public static int getGreatest(double[] population) {
		double change;
		double maxChange = 0; //the actual value of the highest population growth
		int indexMaxChange = -1; //the location in the array of the highest population change
		for(int i = 0; i < 41; i++) {
			if(i < 40) {
				change = population[i] - population[i + 1];
				change *= -1;
				if(change > maxChange) {
					maxChange = change;
					indexMaxChange = i;
				}
			}
		}
		return indexMaxChange;
	}
	
	/**
		The getLeast method determines which year had the smallest increase in population.
		
		@param population An array containing all the values for the midyear pop. in
		the United States from 1950 through 1990.
		@return indexMinChange The location in the population array of the year with the smallest
		change in population.
	*/
	public static int getLeast(double[] population) {
		double change;
		double minChange = ((population[0] - population[1]) * -1);
		int indexMinChange = -1;
			for(int i = 0; i < 41; i++) {
				if(i < 40) {
					change = population[i] - population[i + 1];
					change *= -1;
					if(change <= minChange) {
						minChange = change;
						indexMinChange = i;
					}
				}
			}
			return indexMinChange;
		}
	}
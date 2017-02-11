import java.io.*;
import java.util.*;
public class NumberAnalysis {
	private double[] fileNumbers;
	
	/**
		The constructor accepts a String containing the name of a file, it then
		reads the values in this file and stores them in an array of doubles.
		
		@param fileName The name of a file.
	*/
	
	public NumberAnalysis(String fileName) throws IOException {
		fileNumbers = new double[12];
		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);
		for(int i = 0; i < 12; i++) {
			fileNumbers[i] = inputFile.nextDouble();
			if(i < 11) {
				inputFile.nextLine();
			}
		}
		inputFile.close();
	}
	
	/**
		The getLow method returns the lowest value from the file.
		
		@return low The lowest value in the file.
	*/
	
	public double getLow() {
		double low = fileNumbers[0];
		for(int i = 1; i < 12; i++) {
			if(fileNumbers[i] < low) {
				low = fileNumbers[i];
			}
		}
		return low;
	}
	
	/**
		The getHigh method returns the highest value from the file.
		
		@return high The highest value in the file.
	*/
	
	public double getHigh() {
		double high = fileNumbers[0];
		for(int i = 1; i < 12; i++) {
			if(fileNumbers[i] > high) {
				high = fileNumbers[i];
			}
		}
		return high;
	}
	
	/**
		The getTotal method adds all of the numbers in the file together and returns the total.
		
		@return total The total of all the numbers in the file.
	*/
	
	public double getTotal() {
		double total = 0;
		for(int i = 0; i < 12; i++) {
			total += fileNumbers[i];
		}
		return total;
	}
	
	/**
		The getAverage method finds the average of all the values stored in the file.
		
		@return average The average of all the numbers in the file.
	*/
	
	public double getAverage() {
		double average;
		double total = 0;
		for(int i = 0; i < 12; i++) {
			total += fileNumbers[i];
		}
		average = total / 12;
		return average;
	}
}
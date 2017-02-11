import java.util.*;
public class ArrayOperations {
	public static void main(String[] args) {
		int[] testData = {2, 6, 28, 5, 3};
		int total, high, low;
		double average;
		total = getTotal(testData);
		average = getAverage(testData);
		high = getHighest(testData);
		low = getLowest(testData);
		System.out.println("The total of your array is " + total + ".");
		System.out.println("The average of your array is " + average + ".");
		System.out.println("The highest value in your array is " + high + ".");
		System.out.println("The lowest value in your array is " + low + ".");
	}
		
	/**
		The getTotal method accepts a one-dimensional array as an argument
		and returns the total of the values in the array.
		
		@param myArray A one-dimensional array.
		@return total The total of the values of the array.	
	*/
	public static int getTotal(int[] myArray) {
		int total = 0;
		for(int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}
		return total;
	}
	
	/**
		The getAverage method accepts a one-dimensional array as an argument
		and returns the average of the value of the array.
		
		@param userArray A one-dimensional array.
		@return average The average of all the values of the array.
	*/
	public static double getAverage(int[] userArray) {
		double average;
		double total = 0;
		for(int i = 0; i < userArray.length; i++) {
			total += userArray[i];
		}
		average = total / userArray.length;
		return average;
	}
	
	/**
		The getHighest method accepts a one-dimensional array as an argument
		and returns the highest value in an array.
		
		@param aArray A one-dimensional array.
		@return highestValue The highest value of the array.
	*/
	public static int getHighest(int[] aArray) {
		int highestValue;
		highestValue = aArray[0];
		for(int i = 1; i < aArray.length; i++) {
			if(aArray[i] > highestValue) {
				highestValue = aArray[i];
			}
		}
		return highestValue;
	}
	
	/**
		The getLowest method accepts a one-dimensional array as its argument and returns
		the lowest value in the array.
		
		@param bArray A one-dimensional array.
		@return lowestValue The lowest value in the array.
	*/
	public static int getLowest(int[] bArray) {
		int lowestValue;
		lowestValue = bArray[0];
		for(int i = 1; i < bArray.length; i++) {
			if(bArray[i] < lowestValue) {
				lowestValue = bArray[i];
			}
		}
		return lowestValue;
	}
}
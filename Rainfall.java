import java.util.*;
public class Rainfall {
	private double[] rainfall = new double[12];
	
	//constructor
	public Rainfall(double[] rain) {
		rainfall = rain;
	}
	
	/**
		The totalRainfall method calculates the total amount of rainfall
		in one year.
		
		@return totalRain The total amount of rainfall in one year.
	*/
	public double totalRainfall() {
		double totalRain = 0;
		for(int i = 0; i < rainfall.length; i++) {
			totalRain += rainfall[i];
		}
		return totalRain;
	}
	
	/**
		The averageRainfall method calculates and returns the average
		amount of rainfall per month.
		
		@return average The average amount of rainfall received in a month.
	*/
	public double averageRainfall() {
		double average; //the average rainfall per month
		average = totalRainfall() / 12;
		return average;
	}
	
	/**
		The mostRain method calculates which month received the highest
		amount of rain.
		
		@return rainiestMonth Is the index number the represents the location
		of the rainiest month in the rainfall array.
	*/
	public int mostRain() {
		int rainiestMonth = 0;
		double mostRainfall = rainfall[0];
		for(int i = 1; i < rainfall.length; i++) {
			if(rainfall[i] > mostRainfall) {
				mostRainfall = rainfall[i];
				rainiestMonth = i;
			}
		}
		return rainiestMonth;
	}
	
	/**
		The leastRain method calculates which month received the least
		amount of rain.
		
		@return leastRain Is the index number that represents the month with the least
		amount of rain in the rainfall array.
	*/
	public int leastRain() {
		int leastRain = 0;
		double lowestRain = rainfall[0];
		for(int i = 0; i < rainfall.length; i++) {
			if(rainfall[i] < lowestRain) {
				lowestRain = rainfall[i];
				leastRain = i;
			}
		}
		return leastRain;
	}
}
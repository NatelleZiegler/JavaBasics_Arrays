import java.util.*;
public class TwoDimensionalArrayOps {
	public static void main(String[] args) {
		int[][] testArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Scanner scan = new Scanner(System.in);
		int arrayTotal; //the accumulated total of all elements in the array
		arrayTotal = getTotal(testArray);
		int average, rowTotal, colTotal, high, low;
		average = getAverage(testArray);
		System.out.print("Enter the subscript of the row you would like to sum: ");
		int rowNum = scan.nextInt();
		scan.nextLine();
		while(rowNum < 0 && rowNum > 2) {
			System.out.println("Error. You must choose a valid subscript for a row in the array.");
			System.out.print("Enter the subscript of the row you would like to sum: ");
			rowNum = scan.nextInt();
			scan.nextLine();
		}
		rowTotal = getRowTotal(testArray, rowNum);
		high = getHighestInRow(testArray, rowNum);
		low = getLowestInRow(testArray, rowNum);
		System.out.print("Enter the subscript of the column you would like to sum: ");
		int colNum = scan.nextInt();
		scan.nextLine();
		while(colNum < 0 && colNum > 2) {
			System.out.println("Error. You must choose a valid subscript for a column in the array.");
			System.out.print("Enter the subscript of the column you would like to sum: ");
			colNum = scan.nextInt();
			scan.nextLine();
		}
		colTotal = getColTotal(testArray, colNum);
		System.out.println("The total of all the values in the array is " + arrayTotal + ".");
		System.out.println("The average of all the values in the array is " + average + ".");
		System.out.println("The total of all the values in row " + rowNum + " is " + rowTotal + ".");
		System.out.println("The highest value in row " + rowNum + " is " + high + ".");
		System.out.println("The lowest value in row " + rowNum + " is " + low + ".");
		System.out.println("The total of all the values in column " + colNum + " is " + colTotal + ".");
	}
		
	/**
		The getTotal method accepts a two-dimensional array as its
		argument and returns the total of all the values in the array.
			
		@param myArray A 2-D array initialized with test values.
		@return total The total of all the elements in the array.
	*/
	public static int getTotal(int[][] myArray) {
		int total = 0; //Accumulator, set to 0
		//Sum the array elements
		for(int row = 0; row < myArray.length; row++) {
			for(int col = 0; col < myArray[row].length; col++) {
				total += myArray[row][col];
			}
		}
		return total;
	}
		
	/**
		The getAverage method accepts a two-dimensional array as its
		argument and returns the total of all the values in its array.
			
		@param myArray A 2-D array initialized with test values.
		@return average The average value of all elements in the array.
	*/
	public static int getAverage(int[][] myArray) {
		int total = 0; //Accumulator, set to 0
		//Sum the array elements
		for(int row = 0; row < myArray.length; row++) {
			for(int col = 0; col < myArray[row].length; col++) {
				total += myArray[row][col];
			}
		}
		int average = total / 9;
		return average;
	}
	
	/**
		The getRowTotal accepts a two-dimensional array as its first argument and
		an integer as its second argument. The method will return the total of the values
		in the second array.
			
		@param myArray A 2-D array initialized with test values.
		@param row A subscript of a row in the array.
		@return rowTotal The total of the values in the specified row.
	*/
		
	public static int getRowTotal(int[][] myArray, int row) {
		int rowTotal = 0;
		for(int col = 0; col < myArray[row].length; col++) {
			rowTotal += myArray[row][col];
		}
		return rowTotal;
	}
	
	/**
		The getColTotal accepts a two-dimensional array as its first argument and
		an integer as its second argument. The method will return the total of the values
		in the second array.
			
		@param myArray A 2-D array initialized with test values.
		@param col A subscript of a row in the array.
		@return colTotal The total of the values in the specified column.
	*/
		
	public static int getColTotal(int[][] myArray, int col) {
		int colTotal = 0;
		for(int row = 0; row < myArray.length; row++) {
			colTotal += myArray[row][col];
		}
		return colTotal;
	}
	
	/**
		The getHighestInRow method returns the highest value located in a specified row.
		
		@param myArray A 2-D array initialized with test values.
		@param row A subscript of a row in the array.
		@return high The highest value in the specified row in the array.
	*/
		
	public static int getHighestInRow(int[][] myArray, int row) {
		int high = myArray[row][0];
		for(int col = 0; col < myArray[row].length; col++) {
			if(myArray[row][col] > high) {
				high = myArray[row][col];
			}
		}
		return high;
	}
	
	/**
		The getLowestInRow method returns the highest value located in a specified row.
		
		@param myArray A 2-D array initialized with test values.
		@param row A subscript of a row in the array.
		@return high The highest value in the specified row in the array.
	*/
		
	public static int getLowestInRow(int[][] myArray, int row) {
		int low = myArray[row][0];
		for(int col = 0; col < myArray[row].length; col++) {
			if(myArray[row][col] < low) {
				low = myArray[row][col];
			}
		}
		return low;
	}
}
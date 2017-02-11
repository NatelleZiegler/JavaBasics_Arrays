import java.util.*;
public class RowColSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] days = new int[29][5];
		//get the values
		for(int i = 0; i < days.length; i++) {
			for(int iCol = 0; iCol < days[i].length; iCol++) {
				System.out.print("Enter the value located in row " + i + " and column " + iCol + ": ");
				days[i][iCol] = scan.nextInt();
				scan.nextLine();
			}
		
		}
		//sum the rows
		int total; //accumulator
		for(int row = 0; row < days.length; row++) {
			//set accumulator to zero
			total = 0;
			//sum a row
			for(int col = 0; col < days[row].length; col++) {
				total += days[row][col];
			}
			System.out.println("The total of row " + row + " is " + total + ".");
		}
		
		//sum the columns
		int colTotal; //accumulator
		int colNum = 0;
		for(int col = 0; col < days[0].length; col++) {
			//set the accumulator to zero
			total = 0;
			for(int row = 0; row < days.length; row++) {
				total += days[row][col];
			}
			System.out.println("The total of column " + col + " is " + total);
		}
	}
}
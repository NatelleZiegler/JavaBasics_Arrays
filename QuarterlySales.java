import java.util.*;
public class QuarterlySales {
	public static void main(String[] args) {
		double[][] sales = new double[4][6];
		Scanner scan = new Scanner(System.in);
		for(int quarter = 0; quarter < 4; quarter++) {
			System.out.println("Please enter the sales statistics for Quarter " + (quarter + 1) + " for " + 
			"each division in your company: ");
			for(int div = 0; div < 6; div++) {
				System.out.print("Division number " + (div + 1) + ": ");
				sales[quarter][div] = scan.nextDouble();
				scan.nextLine();
				while(sales[quarter][div] < 0) {
					System.out.println("Your division's sales for the quarter cannot be less than 0.");
					System.out.print("Division number " + (div + 1) + ": ");
					sales[quarter][div] = scan.nextDouble();
					scan.nextLine();
				}			
			} //close inner for loop
		} //close outer for loop
		System.out.println();
		double total; //will be used to hold the total sales for the quarter
		double previousSales = 0;
		for(int quart = 0; quart < 4; quart++) {
		total = 0; //for each new iteration of a quarter, we need to reset the total to zero
		System.out.println("Here are the sales figures by division for quarter " + (quart + 1) + ": ");
		//display sales figures by division
			for(int i = 0; i < 6; i++) {
				System.out.print("Division " + (i + 1) + ": ");
				System.out.printf("$%,.2f", sales[quart][i]);
				System.out.println();
			}
		//this next segment will display each division's increase/decrease in sales for the quarter
			if(quart > 0) {
				for(int i = 0; i < 6; i++) {
					double change; //the change, pos or neg, in sales for a division from quarter to quarter
					change = sales[quart][i] - sales[(quart - 1)][i];
					if(change < 0) {
						change *= -1;
						System.out.print("Division " + (i + 1) + " had a ");
						System.out.printf("$%,.2f decrease in sales from quarter ", change);
						System.out.println((quart) + " to quarter " + (quart + 1) + ".");
					}
					else if(change > 0) {
						System.out.print("Divison " + (i + 1) + " had a ");
						System.out.printf("$%,.2f increase in sales from quarter ", change);
						System.out.println((quart) + " to quarter " + (quart + 1) + ".");
					}
					else {
						System.out.println("Divison " + (i + 1) + "'s sales figures remained consistant from quarter " + (quart) + " to quarter " + (quart + 1) + ".");
					}
				}
			}
			//calculating the total for the quarter
			for(int col = 0; col < 6; col++) {
				total += sales[quart][col];
			}
			System.out.printf("The total sales for quarter " + (quart + 1) + " are $%,.2f.", total);
			System.out.println();
			double quartChange = 0;
			if(quart > 0) {
				quartChange = total - previousSales;
				if(quartChange > 0) {
					System.out.print("The company had a "); 
					System.out.printf("$%,.2f increase in sales from ", quartChange);
					System.out.print("quarter " + (quart) + " to quarter " + (quart + 1));
					System.out.println();
				}
				else if(quartChange < 0) {
					quartChange *= -1;
					System.out.print("The company had a ");
					System.out.printf("$%,.2f decrease in sales from ", quartChange);
					System.out.print("quarter " + (quart) + " to quarter " + (quart + 1));
					System.out.println();
				}
				else {
					System.out.println("The company's sales figures remained consistant from quarter " + (quart) + " to quarter " + (quart + 1) + ".");
				}
			}
			previousSales = total;
			
			//calculate the average sales for all divisions in the given quarter
			total /= 6;
			System.out.print("The average sales for all divisions in quarter number " + (quart + 1) + " is ");
			System.out.printf("$%,.2f", total);
			System.out.println();
			
			double highestDiv = sales[quart][0]; //to hold value of the divion with the highest sales figures for the quarter
			int highestDivNumber = 10; //the index of the division with the highest sales for the quarter
			for(int i = 0; i < 6; i++) {
				if(sales[quart][i] >= highestDiv) {
					highestDiv = sales[quart][i];
					highestDivNumber = (i + 1);
				}
			}
			System.out.println("The division with the highest sales figures for quarter " + (quart + 1) + " is division " + (highestDivNumber) + ".");
			System.out.println();
		} //closes for loop controlling quarters
	}
}
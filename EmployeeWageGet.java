import java.util.*;
public class EmployeeWageGet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Payroll pay = new Payroll();
		int[] myEmployees = new int[7];
		myEmployees = pay.getEmployeeId(); //setting the employee numbers to those designated by the book
		int[] employHours = new int[7]; //for holding the hours worked by staff of 7
		double[] employPay = new double[7];
		double[] employWages = new double[7];
		for(int i = 0; i < myEmployees.length; i++) {
			System.out.print("Enter the hours worked by employee number " + myEmployees[i] + ": ");
			employHours[i] = scan.nextInt();
			scan.nextLine();
			while(employHours[i] < 0) {
				System.out.println("The hours worked by your employees cannot be less than zero.");
				System.out.print("Enter the hours worked by employee number " + myEmployees[i] + ": ");
				employHours[i] = scan.nextInt();
				scan.nextLine();
			}
			//now collect the hourly rate for each employee
			System.out.print("Enter the hourly rate of pay for employee number " + myEmployees[i] + ": ");
			employPay[i] = scan.nextDouble();
			scan.nextLine();
			while(employPay[i] < 6.00) {
				System.out.println("Each employee's hourly wages cannot be less than $6.00.");
				System.out.print("Enter the hourly rate of pay for employee number " + myEmployees[i] + ": ");
				employPay[i] = scan.nextDouble();
				scan.nextLine();
			}
			//now calculate gross pay
			employWages[i] = employHours[i] * employPay[i];
		} //end of for loop that iterates for all seven employees
		
		pay.setWages(employWages);
		for(int index = 0; index < 7; index++) {
			double earnings;
			earnings = pay.getGrossPay(myEmployees[index]);
			System.out.print("Employee number " + myEmployees[index] + " earned: ");
			System.out.printf("$%,.2f.", earnings);
			System.out.println();
		}
	}
} //close program
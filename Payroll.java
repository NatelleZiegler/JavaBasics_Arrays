public class Payroll {
	private int[] employeeId = {5658845, 5420125, 7895122, 8777541, 8451277, 1302850, 75804893};
	private int[] hours = new int[7];
	private double[] payRate = new double[7];
	private double[] wage = new double[7];
	
	//no-arg constructor
	public Payroll() {
	}
	
	//accessors
	public int[] getHours() {
		return hours;
	}
	
	public double[] getPayRate() {
		return payRate;
	}
	
	public double[] getWages() {
		return wage;
	}
	
	public int[] getEmployeeId() {
		return employeeId;
	}
	
	//mutators
	public void setHours(int[] hoursWorked) {
		hours = hoursWorked;
	}
	
	public void setPayRate(double[] pay) {
		payRate = pay;
	}
	
	public void setWages(double[] earnings) {
		wage = earnings;
	}
	
	public void setEmployeeId(int[] idNum) {
		employeeId = idNum;
	}
	
	/**
		The findGrossPay method returns the gross pay for a given employee.
		
		@param employeeId An employee's identification number.
		@return grossPay The wages of earned by the employee identified by the given number.
	*/
	
	public double getGrossPay(int idNumber) {
		double grossPay = 0;
		for(int i = 0; i < employeeId.length; i++) {
			if(idNumber == employeeId[i]) {
				grossPay = wage[i];
			}
		}
		return grossPay;
	}
} //close Payroll class
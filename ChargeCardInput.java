import java.util.*;
public class ChargeCardInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your card number: ");
		String input;
		int cardNum;
		input = scan.nextLine();
		while(input.length() < 7) {
			System.out.println("Your card number must be at least seven digits long.");
			System.out.print("Please enter your card number: ");
			input = scan.nextLine();
		}
		cardNum = Integer.parseInt(input);
		while(cardNum < 0) {
			System.out.println("Your card number cannot be a negative number.");
			System.out.print("Please enter your card number: ");
			input = scan.nextLine();
			while(input.length() < 7) {
				System.out.println("Your card number must be at least seven digits long.");
				System.out.print("Please enter your card number: ");
				input = scan.nextLine();
			}
			cardNum = Integer.parseInt(input);
		}
		ChargeAccount account = new ChargeAccount();
		boolean isValid;
		isValid = account.validateCard(cardNum);
		if(isValid == true){
			System.out.println("The card number you provided is valid.");
		}
		else {
			System.out.println("The card number you provided is not valid.");
		}
	}
}
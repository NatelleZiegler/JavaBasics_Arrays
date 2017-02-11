import java.util.*;
public class LotteryDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lottery lotto = new Lottery();
		int[] userSelects = new int[5];
		lotto.setLottery();
		
		//working the user through the input of five valid int selections
		System.out.println("Please enter five digits between 0 and 9: ");
		for(int i = 0; i < 5; i++) {
			System.out.print("> ");
			userSelects[i] = scan.nextInt();
			scan.nextLine();
			while(userSelects[i] < 0 || userSelects[i] > 9) {
				System.out.println("All of your selections must be between 0 and 9.");
				System.out.print("> ");
				userSelects[i] = scan.nextInt();
				scan.nextLine();
			}
		}
		
		int numberMatch; //the number of user selections that match the winning lotto numbers
		numberMatch = lotto.checkLottoNum(userSelects);
		int[] winningLotto = new int[5]; //to hold the winning lottery numbers
		winningLotto = lotto.getLotteryNumber();
		System.out.println("The winning lottery numbers were: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(winningLotto[i]);
		}
		if(numberMatch == 5) {
			System.out.println("All five of your selections match! You are a grand winner!");
		}
		else {
			System.out.println("The number of matching lottery numbers was " + numberMatch + ".");
		}
	}
}
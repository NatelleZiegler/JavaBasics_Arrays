import java.util.*;
public class Lottery {
	private int[] lotteryNumbers; 
	
	public void setLottery() {
		Random rand = new Random();
		lotteryNumbers = new int[5];
		for(int i = 0; i < 5; i++) {
			lotteryNumbers[i] = rand.nextInt(10);
		}
	}
	
	/**
		The checkLottoNum method checks a user's lottery picks.
		
		@param userPicks An array of five integers representing a user's lotto selections.
		@return numMatch The number of digits that match between user's selection and winning numbers.
	*/
	public int checkLottoNum(int[] userPicks) {
		int numMatch = 0; //the number of matching digits, initialized to zero
		for(int i = 0; i < 5; i++) {
				if(lotteryNumbers[i] == userPicks[i]) {
					numMatch += 1;
				}
		}
		return numMatch;
	}
	
	/**
		The getLotteryNumbers method returns a copy of the lottery numbers.
		
		@return lotteryNumbers An array representing five winning lottery numbers.
	*/
	public int[] getLotteryNumber() {
		return lotteryNumbers;
	}
}
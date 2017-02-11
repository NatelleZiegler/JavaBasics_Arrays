import java.io.*;
import java.util.*;
public class ChargeAccountRedux { 
	private int[] chargeCard = new int[18];
	
	//constructor
	public ChargeAccountRedux() throws IOException {
		File myFile = new File("ChargeCards.txt");
		Scanner inputFile = new Scanner(myFile);
		for(int i = 0; i < chargeCard.length; i++) {
			chargeCard[i] = inputFile.nextInt();
			if(i < 17) {
				inputFile.nextLine();
			}
		}
		inputFile.close();
	}
	
	//accessor
	public int[] getChargeCard() {
		return chargeCard;
	}
	
	/**
		The validateCard method returns a boolean value that is true is the 
		card number is found in the array chargeCard, false otherwise.
		
		@param accountNum The card number entered by the user in the main method.
		@return found A boolean value that is true if the card is valid.
	*/	
	public boolean validateCard(int accountNum) {
		int index; //loop control variable
		boolean found; //flag indicating search results
		
		//element 0 is the starting point of the search
		index = 0;
		
		//if the charge number is never found, this value will not be changed
		found = false;
		
		//now we'll search the array
		while(!found && index < chargeCard.length) {
			if(chargeCard[index] == accountNum) {
				found = true;
			}
			index++;
		}
		return found;
	}
}
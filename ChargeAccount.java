public class ChargeAccount {
	private int[] chargeCard = {5658845, 8080152, 1005231, 4250125, 4562555, 6545321, 7895122, 5552012,
	3852085, 8777541, 5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 1250255, 4581002};
	
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
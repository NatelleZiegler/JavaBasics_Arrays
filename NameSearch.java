import java.util.*;
import java.io.*;
public class NameSearch {
	public static void main(String[] args) throws IOException {
		//grabbing the girl names
		File girlFile = new File("GirlsNames.txt");
		Scanner inputGirl = new Scanner(girlFile);
		String[] girls = new String[200];
		for(int i = 0; i < 200; i++) {
			girls[i] = inputGirl.nextLine();
		}
		inputGirl.close();
		
		//grabbing the boy names
		File boyFile = new File("BoysNames.txt");
		Scanner inputBoy = new Scanner(boyFile);
		String[] boys = new String[200];
		for(int i = 0; i < 200; i++) {
			boys[i] = inputBoy.nextLine();
		}
		inputBoy.close();
		
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("Enter the name you would like to search for: ");
		name = scan.nextLine();
		System.out.println("Is the name you would like to search for:\n(A) A boy's name\n(B) A girl's name\n(C) A unisex name");
		System.out.println();
		System.out.print("Enter A, B, or C ");
		String input;
		char choice;
		input = scan.nextLine();
		input = input.toUpperCase();
		choice = input.charAt(0);
		while(choice != 'A' && choice != 'B' && choice != 'C') {
			System.out.println("Please select one of the above options only.");
			System.out.print("Enter A, B, or C: ");
			input = scan.nextLine();
			input = input.toUpperCase();
			choice = input.charAt(0);
		}
		
		int placeArray; //the location of the name in the array, -1 if not found
		int whichArray = 5; //1 if location searched was boy array, 2 if location searched was girl array
		
		switch(choice) {
			case 'A':
				placeArray = sequentialSearch(boys, name);
				whichArray = 1;
			break;
			case 'B':
				placeArray = sequentialSearch(girls, name);
				whichArray = 2;
			break;
			case 'C':
				placeArray = sequentialSearch(boys, name);
				whichArray = 1;
				if(placeArray < 0) {
					placeArray = sequentialSearch(girls, name);
					whichArray = 2;
				}
			break;
			default:
				System.out.println("Error. Invalid option.");
				placeArray = -1;
		}
		
		if(placeArray == -1) {
			System.out.println(name + " was NOT one of the 200 most popular in the United States in the 2000's.");
		}
		else if(placeArray >= 0 && whichArray == 1){
			System.out.print(name + " is number " + (placeArray + 1) + " on the ");
			System.out.print("list of the 200 most popular boy's names in the US.\n");
		}
		else if(placeArray >= 0 && whichArray == 2){
			System.out.print(name + " is number " + (placeArray + 1) + " on the ");
			System.out.print("list of the 200 most popular girl's names in the US.\n");
		}
		else {
			System.out.println("Error.");
		}
	}
	
	/**
		The sequentialSearch method searches an array for a value.
		
		@param array The array to search through.
		@param The value to search for.
		@return The subscript of the value if found in the array, otherwise -1.
	*/
	
	public static int sequentialSearch(String[] array, String value) {
		int index; //loop control variable
		int element; //Element the value is found at
		boolean found; //Flag indicating search results
		
		//Element 0 is the starting point of the search.
		index = 0;
		
		//Store the default values for the element and found variables
		element = -1;
		found = false;
		
		//search the array
		while(!found && index < array.length) {
			if(array[index].equals(value)) {
				found = true;
				element = index;
			}
			index++;
		}
		return element;
	}
}
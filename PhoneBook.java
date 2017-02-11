import java.util.*;
import java.io.*;
public class PhoneBook {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintWriter outputFileName = new PrintWriter("Names.txt");
		System.out.println("Please type five names for your phone book.");
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + ". ");
			String name = scan.nextLine();
			outputFileName.println(name);
		}
		outputFileName.close();
		PrintWriter outputFileNumbers = new PrintWriter("Numbers.txt");
		System.out.println("Please type five phone numbers for your phone book.");
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + ". ");
			String number = scan.nextLine();
			outputFileNumbers.println(number);
		}
		outputFileNumbers.close();
		String name1, name2, name3, name4, name5;
		String number1, number2, number3, number4, number5;
		File nameFile = new File("Names.txt");
		Scanner inputName = new Scanner(nameFile);
		name1 = inputName.nextLine();
		name2 = inputName.nextLine();
		name3 = inputName.nextLine();
		name4 = inputName.nextLine();
		name5 = inputName.nextLine();
		inputName.close();
		File numFile = new File("Numbers.txt");
		Scanner inputNum = new Scanner(numFile);
		number1 = inputNum.nextLine();
		number2 = inputNum.nextLine();
		number3 = inputNum.nextLine();
		number4 = inputNum.nextLine();
		number5 = inputNum.nextLine();
		PhoneBookEntry entry1 = new PhoneBookEntry(name1, number1);
		PhoneBookEntry entry2 = new PhoneBookEntry(name2, number2);
		PhoneBookEntry entry3 = new PhoneBookEntry(name3, number3);
		PhoneBookEntry entry4 = new PhoneBookEntry(name4, number4);
		PhoneBookEntry entry5 = new PhoneBookEntry(name5, number5);
		
		ArrayList<PhoneBookEntry> phones = new ArrayList<PhoneBookEntry>();
		phones.add(entry1);
		phones.add(entry2);
		phones.add(entry3);
		phones.add(entry4);
		phones.add(entry5);
		
		System.out.println("Here are the number and names you have stored in your phone book.");
		System.out.println("Names\t\t\tPhone Numbers");
		for(int index = 0; index < phones.size(); index++) {
			System.out.println(phones.get(index).getName() + "\t\t\t" + phones.get(index).getPhone());
		}
	}
}
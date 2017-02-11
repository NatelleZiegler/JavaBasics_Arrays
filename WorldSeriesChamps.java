import java.io.*;
import java.util.*;
public class WorldSeriesChamps {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of a baseball team: ");
		String team = scan.nextLine();
		File seriesFile = new File("WorldSeriesWinners.txt");
		Scanner inputFile = new Scanner(seriesFile);
		String[] worldSeries = new String[111];
		for(int i = 0; i < 111; i++) {
			worldSeries[i] = inputFile.nextLine();
		}
		inputFile.close();
		int numWins = 0;
		for(int i = 0; i < 111; i++) {
			if(worldSeries[i].equals(team)) {
				numWins += 1;
			}
		}
		if(numWins > 0) {
			System.out.println("The " + team + " have won the World Series " + numWins + " times.");
		}
		else {
			System.out.println("The " + team + " have never won the World Series.");
		}
	}
}
import java.util.*;
public class TwentyElementArray {
	public static void main(String [] args) {
		int[] names = new int[20];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < names.length; i++) {
			System.out.print("What integer do you want to store in index " + i + ": ");
			names[i] = scan.nextInt();
			scan.nextLine();
		}
		for(int index = 0; index < names.length; index++) {
			System.out.print("Index " + index + ": ");
			System.out.println(names[index]);
		}
	}
}
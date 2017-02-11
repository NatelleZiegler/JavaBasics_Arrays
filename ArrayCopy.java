import java.util.*;
public class ArrayCopy {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberArray1 = new int[100];
		int[] numberArray2 = new int[100];
		//filling up the numberArray1
		for(int i = 0; i < numberArray1.length; i++) {
			System.out.print("What integer do you want to store in index " + i + ": ");
			numberArray1[i] = scan.nextInt();
			scan.nextLine();
		}
		//copying the numberArray1 to the numberArray2
		for(int index = 0; index < numberArray1.length; index++) {
			numberArray2[index] = numberArray1[index];
		}
		//printing out the contents of both arrays as comparison
		for(int in = 0; in < numberArray1.length; in++) {
			System.out.print("Index " + in + ": ");
			System.out.print("\t\t" + numberArray1[in] + "\t\t" + numberArray2[in]);
			System.out.println();
		}
	}
}
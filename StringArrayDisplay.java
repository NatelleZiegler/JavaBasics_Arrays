public class StringArrayDisplay {
	public static void main(String[] args) {
		int totalLength = 0;
		String[] people = {"Einstein", "Newton", "Copernicus", "Kepler"};
		for(int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}
		for(int index = 0; index < people.length; index++) {
			totalLength += people[index].length();
		}
		System.out.println();
		System.out.println("The total length of all the strings in the people array is " + totalLength + ".");
	}
}
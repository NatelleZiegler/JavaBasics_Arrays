import java.util.*;
public class ArrayListCars {
	public static void main(String[] args) {
		ArrayList <String> cars = new ArrayList<String>();
		
		cars.add("Chevy Malibu");
		cars.add("Honda Fit");
		cars.add("Dodge Charger");
		
		for(String carName : cars) {
			System.out.println(carName);
		}
	}
}
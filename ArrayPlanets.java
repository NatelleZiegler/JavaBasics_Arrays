public class ArrayPlanets {
	public static void main(String [] args) {
		String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
		for(int index = 0; index < planets.length; index++) {
			System.out.println(planets[index]);
			System.out.println(planets[index].charAt(0));
		}
	}
}
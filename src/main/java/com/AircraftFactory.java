public class AircraftFactory {
	private static int id = 0;
	public static AFlyable newAircraft(String p_type, String p_name, Coordinates p_coordinate) {
		id++;
		switch (p_type) {
			case "JetPlane":
				return new JetPlane(id, p_name, p_coordinate);
			case "Baloon":
				return new Baloon(id, p_name, p_coordinate);
			case "Helicopter":
				return new Helicopter(id, p_name, p_coordinate);
			default:
				System.out.println("Error: Undefined Aircraft Type"); // Exception
				break;
		}
	}
}
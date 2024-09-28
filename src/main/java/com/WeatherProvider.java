public class WeatherProvider {
	private String[] weather;
	private static WeatherProvider instance;

	private WeatherProvider() {
		if (instance == null)
			instance = new WeatherProvider();
	}

	public String getCurrentWeather(Coordinates p_coordinate) {
		return "";
	}
}
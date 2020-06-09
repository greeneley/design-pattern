package WeatherData;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherdata = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherdata);
		StatisticsDisplay staticsDisplay = new StatisticsDisplay(weatherdata);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherdata);

		
		weatherdata.setMeasurements(80,  65,  30.4f);
		weatherdata.setMeasurements(82,  70,  29f);

	}

}

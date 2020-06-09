package WeatherData;

public class StatisticsDisplay implements Observer, Subject {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

	}

}

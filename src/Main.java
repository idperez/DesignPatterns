import ObserverPattern.CurrentConditionsDisplay;
import ObserverPattern.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 12, 3);
        weatherData.setMeasurements(82, 12, 3);
    }
}

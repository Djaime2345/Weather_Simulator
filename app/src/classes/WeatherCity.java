package classes;

public class WeatherCity extends City{
    private double temperature;
    private double humidity;
    private WeatherType weatherType;

    /**
     *
     * @param city
     * @param temperature
     * @param humidity
     * @param weatherType
     */
    public WeatherCity(City city, double temperature, double humidity, WeatherType weatherType) {
        super(city.getName(), city.getCountry(), city.getPopulation());
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherType = weatherType;

    }


}

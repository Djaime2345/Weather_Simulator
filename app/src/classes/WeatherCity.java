package classes;

import exceptions.InvalidDateException;
import exceptions.InvalidHumidityException;
import exceptions.InvalidTemperatureException;
import exceptions.InvalidWeatherException;

import java.time.LocalDate;

public class WeatherCity extends City{
    private double temperature;
    private double humidity;
    private WeatherType weatherType;
    private LocalDate date;

    /**
     *
     * @param city
     * @param temperature
     * @param humidity
     * @param weatherType
     */
    public WeatherCity(City city, double temperature, double humidity, WeatherType weatherType, LocalDate date) {
        super(city.getName(), city.getCountry(), city.getPopulation());
        setTemperature(temperature);
        setHumidity(humidity);
        setWeatherType(weatherType);
        setDate(date);
    }

    /**
     *
     * @param city
     * @param temperature
     * @param humidity
     * @param weatherType
     */
    public WeatherCity(City city, double temperature, double humidity, WeatherType weatherType) {
        new WeatherCity(city, temperature, humidity, weatherType, LocalDate.now());
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature < -273.15){
            throw new InvalidTemperatureException("You cannot add that temperature");
        }
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        if (humidity < 0){
            throw new InvalidHumidityException("The humidity cannot be less than 0");
        } else {
            this.humidity = humidity;
        }
    }

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(WeatherType weatherType) {
        if (existWeatherType(weatherType.name())){
            this.weatherType = weatherType;
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) throws InvalidDateException{
        if (date.isAfter(LocalDate.MAX) || (date.isBefore(LocalDate.MIN))){
            throw new InvalidDateException("The date is not valid");
        } else {
            this.date = date;
        }
    }

    private Boolean existWeatherType(String weather){
        try {
            WeatherType.valueOf(weather);
            return true;
        } catch (InvalidWeatherException e) {
            return false;
        }
    }

    @Override
    public void displayDetails(){
        System.out.println("\t > Weather Display: \n");
        System.out.println("\t - Temperature: " + this.temperature);
        System.out.println("\t - Humidity: " + this.humidity);
        System.out.println("\t - Type: " + this.weatherType.name());
        System.out.println("\t - Date: " + this.date.toString());
    }
}

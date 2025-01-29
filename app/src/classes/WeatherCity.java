package classes;

import exceptions.InvalidDateException;
import exceptions.InvalidHumidityException;
import exceptions.InvalidTemperatureException;
import exceptions.InvalidWeatherException;

import java.time.LocalDate;
import java.util.Date;

public class WeatherCity{
    private City city;
    private double temperature;
    private double humidity;
    private WeatherType weatherType;
    private Date date;

    public WeatherCity(City city, double temperature, double humidity, String weatherType, Date date) {
        this.city = city;
        setTemperature(temperature);
        setHumidity(humidity);
        setWeatherType(weatherType);
        setDate(date);
    }

    public WeatherCity(City city, double temperature, double humidity, String weatherType) {
        new WeatherCity(city, temperature, humidity, weatherType, null);
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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

    public void setWeatherType(String weatherType) {
        if (existWeatherType(weatherType)){
            this.weatherType = WeatherType.valueOf(weatherType);
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    private Boolean existWeatherType(String weather){
        try {
            WeatherType.valueOf(weather);
            return true;
        } catch (InvalidWeatherException e) {
            return false;
        }
    }

    public void displayDetails(){
        System.out.println("\n\t > Weather Display:");
        System.out.println("\t - Temperature: " + this.temperature);
        System.out.println("\t - Humidity: " + this.humidity);
        System.out.println("\t - Type: " + this.weatherType.name());
        System.out.println("\t - Date: " + this.date.toString());
    }
}

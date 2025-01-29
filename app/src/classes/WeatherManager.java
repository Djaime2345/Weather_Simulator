package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public class WeatherManager {
    private HashSet<City> listOfCities = new HashSet<>();
    private HashMap<String, WeatherCity> weatherContainer;

    public void addCity(City city){
        listOfCities.add(city);
    }

    public void getCurrentCities(){
        for (City c: listOfCities){
            c.displayDetails();
        }
    }

    public City getCity(String name){
        for (City c: listOfCities){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }

    public void addWeather(WeatherCity weather){
        String key = obtainKey(weather);
        weatherContainer.put(key, weather);
    }

    public void getWeather(String city){
        AtomicBoolean cityDisplayed = new AtomicBoolean(false);
        weatherContainer.forEach((k,v) ->{
            if(k.startsWith(city)){
                if (!cityDisplayed.get()){
                    v.getCity().displayDetails();
                    cityDisplayed.set(true);
                }
                v.displayDetails();
                }
            });
    }

    private String obtainKey(WeatherCity weather){
        return weather.getCity().getName() + "_" + weather.getDate();
    }
}

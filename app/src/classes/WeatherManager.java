package classes;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class WeatherManager {
    private HashMap<String, WeatherCity> weatherContainer;

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

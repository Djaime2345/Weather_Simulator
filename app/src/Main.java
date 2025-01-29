import classes.City;
import classes.WeatherCity;
import classes.WeatherManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean go = true;

        String city_name;
        String country_name;
        String continent_name;
        int population;
        double temperature;
        double humidity;
        String type;
        String dateOnString;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        WeatherManager manager = new WeatherManager();

        do{
            System.out.println("Welcome to the weather system! What do you want to do?");
            System.out.println("1. Add a city to the system");
            System.out.println("2. Display the cities in the system");
            System.out.println("3. Add a new weather");
            System.out.println("4. Get the weathers of a specific city");
            System.out.println("5. Exit");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Please enter the information for the new city");
                    System.out.println("Name of the city: ");
                    city_name = sc.next();
                    System.out.println("Name of the country: ");
                    country_name = sc.next();
                    System.out.println("Name of the continent: ");
                    continent_name = sc.next();
                    System.out.println("Population of the city: ");
                    population = sc.nextInt();

                    City city = new City(city_name, country_name, continent_name, population);
                    manager.addCity(city);

                    System.out.println("City added successfully!");
                    break;
                case 2:
                    manager.getCurrentCities();
                    break;
                case 3:
                    try {
                        System.out.println("For what city do you want to add a weather?");
                        manager.getCurrentCities();
                        city_name = sc.next();
                        City city_to_add = manager.getCity(city_name);
                        System.out.println("Please add the information for the weather");
                        System.out.println("Temperature (Celsius)");
                        temperature = sc.nextDouble();
                        System.out.println("Humidity");
                        humidity = sc.nextDouble();
                        System.out.println("Type of weather");
                        type = sc.next().toUpperCase();
                        System.out.println("Date (yyyy-MM-dd)");
                        dateOnString = sc.next();
                        date = dateFormat.parse(dateOnString);
                        WeatherCity addedWeather = new WeatherCity(city_to_add, temperature, humidity, type, date);
                        manager.addWeather(addedWeather);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("For what city do you want to search the weather?");
                    manager.getCurrentCities();
                    city_name = sc.next();
                    manager.getWeather(city_name);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    go = false;
            }

        }while(go);
    }
}
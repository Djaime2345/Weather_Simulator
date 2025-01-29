package classes;

import exceptions.InvalidPopulationException;

public class City extends Country{
    private String name;
    private int population;

    public City(String name, String country_name, String continent, int population) {
        super(country_name, continent);
        this.setName(name);
        this.setPopulation(population);
    }

    public City() {
        super();
        new City("Unknown", "Unknown", "Unknown", 0);
    }

    public City(String name, String country_name, String continent){
        new City(name, country_name, continent, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches(".*\\d.*")){
            throw new IllegalArgumentException("The city must not contain numbers");
        } else {
            this.name = name;
        }

    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) throws InvalidPopulationException{
        if (population < 0){
            throw new InvalidPopulationException("You cannot add negative population to a city!!");
        } else{
            this.population = population;
        }
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("\n\t > City Display:");
        System.out.println("\t - Name: " + this.name);
        System.out.println("\t - Population: " + this.population);
    }
}

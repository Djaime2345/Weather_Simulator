package classes;

import exceptions.InvalidPopulationException;

public class City extends Country{
    protected String name;
    protected int population;

    public City(String name, String country_name, String continent, int population) {
        super(country_name, continent);
        this.name = name;
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
        this.name = name;
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
        System.out.println("\t > City Display: \n");
        System.out.println("\t - Name: " + this.name);
        System.out.println("\t - Population: " + this.population);
    }
}

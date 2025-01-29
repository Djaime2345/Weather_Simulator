package classes;

/**
 *
 */

public class City {
    protected String name;
    protected String country;
    protected int population;

    /**
     *
     * @param name
     * @param country
     * @param population
     */
    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public City() {
        new City("Unknown", "Unknown", 0);
    }

    public City(String name, String country){
        new City(name, country, 0);
    }
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     */
    public int getPopulation() {
        return population;
    }

    /**
     *
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }
}

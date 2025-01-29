package classes;

public class Country {
    protected String country_name;
    protected String continent;

    public Country(String country_name, String continent) {
        this.country_name = country_name;
        this.continent = continent;
    }

    public Country (){
        this.country_name = "Unknown";
        this.continent = "Unknown";
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public void displayDetails(){
        System.out.println("\t > Country: \n");
        System.out.println("\t - Name: " + this.country_name);
        System.out.println("\t - Continent: " + this.continent);
    }
}

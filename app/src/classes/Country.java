package classes;

public class Country {
    protected String country_name;
    protected String continent;

    public Country(String country_name, String continent) {
        this.setCountry_name(country_name);
        this.setContinent(continent);
    }

    public Country (){
        this.country_name = "Unknown";
        this.continent = "Unknown";
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        if (continent.matches(".*\\d.*")){
            throw new IllegalArgumentException("The continent must not contain numbers");
        } else {
            this.continent = continent;
        }
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        if (country_name.matches(".*\\d.*")){
            throw new IllegalArgumentException("The country must not contain numbers");
        } else {
            this.country_name = country_name;
        }
    }

    public void displayDetails(){
        System.out.println("\n\t > Country: ");
        System.out.println("\t - Name: " + this.country_name);
        System.out.println("\t - Continent: " + this.continent);
    }
}

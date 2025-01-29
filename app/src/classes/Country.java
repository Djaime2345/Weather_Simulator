package classes;

public class Country {
    private String name;
    private String continent;

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    public Country (){
        this.name = "Unknown";
        this.continent = "Unknown";
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("\t > Country: \n");
        System.out.println("\t - Name: " + this.name);
        System.out.println("\t - Continent: " + this.continent);
    }
}

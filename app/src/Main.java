import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean go = true;

        do{
            System.out.println("Welcome to the weather system! What do you want to do?");
            System.out.println("1. Add a city to the system");
            System.out.println("2. Display the cities in the system");
            System.out.println("3. Add a new weather");
            System.out.println("4. Get the weathers of a specific city");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            String city_name;

            switch (option){
                case 1:
                    System.out.println("Please enter the information for the new city");
                    System.out.println("Name of the city: ");
                    city_name = sc.next();

            }

        }while(go);
    }
}
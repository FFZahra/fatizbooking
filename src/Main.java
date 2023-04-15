import booking.Booking;
import booking.BookingService;
import car.Car;
import car.CarService;
import car.EngineType;
import user.User;
import user.UserService;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        User user1 = new User("Amar Kumar");
        UserService.addUser(user1);
        User user2 = new User("Jane Tyle");
        User user3 = new User("Pablo Juan");
        User user4 = new User("Chin Jin");
        User user5 = new User("Samari Aminu");
        User user6 = new User("Brendan Cruz");
        User user7 = new User("Hassan Bello");
        User user8 = new User("Dmitri Jones");
        User user9 = new User("Sidi Tanko");
        User user10 = new User("Louise Fennel");
        UserService.addUser(user2);
        UserService.addUser(user3);
        UserService.addUser(user4);
        UserService.addUser(user5);
        UserService.addUser(user6);
        UserService.addUser(user7);
        UserService.addUser(user8);
        UserService.addUser(user9);
        UserService.addUser(user10);
        Car car1 = new Car("Renault", "Zoey", EngineType.ALL_ELECTRIC, "PB1234", 35.50);
        Car car2 = new Car("Toyota", "Prius", EngineType.HYBRID_ELECTRIC, "GA2812", 25.00);
        Car car3 = new Car("Honda", "Jazz", EngineType.PETROL, "CV9110", 15.00);
        Car car4 = new Car("Ford", "Focus", EngineType.PETROL, "SF4351" ,11);
        Car car5 = new Car("Volkswagen", "ID3", EngineType.ALL_ELECTRIC, "DE3261", 36);
        Car car6 = new Car("Renault", "Mimi", EngineType.HYBRID_ELECTRIC, "AO7964", 28);
        Car car7 = new Car("Nissan", "Leaf", EngineType.ALL_ELECTRIC, "XC8415", 34.20);
        Car car8 = new Car("BMW", "Tanta", EngineType.DIESEL, "AB4040", 12);
        Car car9 = new Car("Ford", "Longi", EngineType.DIESEL, "MN2227", 15);
        Car car10 = new Car("Volkswagen", "Trimax", EngineType.PETROL, "GH3695", 12.40);
        Car car11 = new Car("Ford", "Focus", EngineType.PETROL, "KO3434", 11);
        Car car12 = new Car("Ford", "Focus", EngineType.PETROL, "QR8765", 11);
        Car car13 = new Car("Ford", "Fiesta-i", EngineType.HYBRID_ELECTRIC, "WC1193", 27.50);
        Car car14 = new Car("Nissan", "Qashqai", EngineType.PETROL, "BY2704", 17);
        Car car15 = new Car("Toyota", "e-Avensis", EngineType.ALL_ELECTRIC, "BN5561", 32.50);

        CarService.addCar(car1);
        CarService.addCar(car4);
        CarService.addCar(car3);
        CarService.addCar(car7);
        CarService.addCar(car2);
        CarService.addCar(car10);
        CarService.addCar(car5);
        CarService.addCar(car8);
        CarService.addCar(car9);
        CarService.addCar(car11);
        CarService.addCar(car15);


        // String input = "runApp";
        // while (!input.equals("Exit")) {
        while (true) {
            System.out.println("***********************************************************");
            System.out.println("        Menu");
            System.out.println();
            System.out.println("1 - Book a Car ");
            System.out.println("2 - View All User Booked Cars ");
            System.out.println("3 - View All Bookings ");
            System.out.println("4 - View Available Cars ");
            System.out.println("5 - View Available Electric Cars ");
            System.out.println("6 - View all users ");
            System.out.println("7 - Exit ");
            System.out.println();
            System.out.println("***********************************************************");
            System.out.print("Choose a menu option: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    // make a booking
                    BookingService.book();
                    System.out.println();
                    break;
                case "2":
                    // view all booked cars
                    BookingService.getBookedCars();
                    System.out.println();
                    break;
                case "3":
                    // view all bookings
                    BookingService.viewBookings();
                    System.out.println();
                    break;
                case "4":
                    // view all available cars
                    CarService.getAllCars();
                    System.out.println();
                    break;
                case "5":
                    // view all available Electric cars
                    System.out.println();
                    System.out.println("All available Electric Cars");
                    System.out.println("****************************");
                    CarService.getAvailableElectrics();
                    System.out.println();
                    break;
                case "6":
                    // view all users
                    System.out.println();
                    System.out.println("All Users");
                    System.out.println("*********");
                    System.out.println("ID   Name");
                    System.out.println("--  ------");
                    for (int i = 0; i < User.getIdKount(); i++) {
                        System.out.println(User.getUsers()[i].toString());
                    }
                    System.out.println("     " + User.getIdKount() + " users.");
                    System.out.println();
                    break;
                case "7":
                    // exit
                    System.out.println("Exit success.");
                    System.exit(0);
                    //  break;
            }
        }
    }
}
package booking;

import car.Car;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class BookingService {
    public static void book(){
        System.out.println("******** BOOK A CAR **********");
        System.out.print("Enter your user ID: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        int uID = Integer.parseInt(id);
        System.out.println();
        System.out.println("Enter the car to be booked: ");
        String dcar = scanner.nextLine();
        Object kar = dcar;
        Car bkcar;
        bkcar = (Car)kar;
        bkcar.setBooked(true);
        System.out.println();
        System.out.println("Enter how many hours you are booking for (minimum 30 mins - 0.5 hr): ");
        String dur = scanner.nextLine();
        Double bkduration = Double.parseDouble(dur);
        LocalDate bkDate = LocalDate.now();

        // String bookd = "bookd" + Booking. getBkingKount();
        // System.out.println(bookd);

        Booking bookd = new Booking(uID, bkcar, bkDate, bkduration);
        addBkng(bookd);
    }

    public static void addBkng(Booking bkng){
        int len = Booking.getBookings().length;
        Booking[] bkngs = Booking.getBookings();
        Booking[] temp = new Booking[len + 1];
        temp[len + 1] = bkng;
        if (len > 0){
            for (int i = 0; i < len; i++){
                temp[i] = bkngs[i];
            }
        }
        Booking.setBookings(temp);
        System.out.println(Booking.getBookings());
    }

    public static void viewBookings(){
        Booking[] allBkngs = Booking.getBookings();
        System.out.println("************ Current Bookings ************");
        for (Booking bkng : allBkngs){
            System.out.println(bkng);
        }
    }

    public static void getBookedCars(){
        Car[] allCars = Car.getFleet();
        System.out.println("************ Current Booked Cars ************");
        for (Car car : allCars){
            if (car.isBooked()){
                System.out.println(car);
            }
        }
    }
}

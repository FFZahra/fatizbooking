package booking;
import car.Car;

import java.time.LocalDate;

public class Booking {
    private static Booking[] bookings = {};
    private static int bkingKount = 0;
    private int userID;
    private Car car2Book;
    private LocalDate bkgDate;
    private double duration;
    private String bkgID;

    static {
        bkingKount++;
    }

    public Booking() {
    }

    public Booking(int userID, Car car2Book, LocalDate bkgDate, double duration) {
        this.userID = userID;
        this.car2Book = car2Book;
        this.bkgDate = bkgDate;
        this.duration = duration;
        this.bkgID = "FB0" + Booking.bkingKount;
    }

    public static int getBkingKount() {
        return bkingKount;
    }

    public static Booking[] getBookings() {
        return bookings;
    }

    public static void setBookings(Booking[] bookings) {
        Booking.bookings = bookings;
    }

    public static void setBkingKount(int bkingKount) {
        Booking.bkingKount = bkingKount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Car getCar2Book() {
        return car2Book;
    }

    public void setCar2Book(Car car2Book) {
        this.car2Book = car2Book;
    }

    public LocalDate getBkgDate() {
        return bkgDate;
    }

    public void setBkgDate(LocalDate bkgDate) {
        this.bkgDate = bkgDate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getBkgID() {
        return bkgID;
    }

    public void setBkgID(String bkgID) {
        this.bkgID = bkgID;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userID=" + userID +
                ", car2Book=" + car2Book +
                ", bkgDate='" + bkgDate + '\'' +
                ", duration=" + duration +
                ", bkgID='" + bkgID + '\'' +
                '}';
    }
}

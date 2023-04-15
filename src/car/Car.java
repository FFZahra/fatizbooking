package car;

import java.util.Objects;

public class Car {
    private static Car[] fleet = {};
    private static int carKount = 0;
    private String brand;
    private String model;
    private EngineType engine;
    private String carNo;
    private boolean isBooked;
    private double costPerHr;
    private String carId;

    public Car() {
    }

    public Car(String brand, String model, EngineType engine, String carNo, double costPerHr) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.carNo = carNo;
        this.costPerHr = costPerHr;
        this.isBooked = false;
        int id = Car.carKount + 1;
        this.carId = "Ride" + id;
        Car.setCarKount(id);
    }

    public static Car[] getFleet() {
        return fleet;
    }

    public static int getCarKount() {
        return carKount;
    }

    public static void setCarKount(int carKount) {
        Car.carKount = carKount;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public static void setFleet(Car[] fleet) {
        Car.fleet = fleet;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public double getCostPerHr() {
        return costPerHr;
    }

    public void setCostPerHr(double costPerHr) {
        this.costPerHr = costPerHr;
    }

    @Override
    public String toString() {
        String status;
        if (this.isBooked){
            status = "booked";
        } else {
            status = "not booked";
        }
        return "" + brand + " " + model + " - " + engine + ", " + costPerHr + "/hr" + ", Status: " + status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isBooked == car.isBooked && Double.compare(car.costPerHr, costPerHr) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engine, isBooked, costPerHr);
    }
}

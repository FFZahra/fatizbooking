package car;

public class CarService {
    public static void getBookedCars(){
        for (Car car : Car.getFleet()){
            if (car.isBooked()){
                System.out.println(car);
            }
        }
    }

    public static void getAvailableElectrics(){
        for (Car car : Car.getFleet()){
            if (car.getEngine() == EngineType.ALL_ELECTRIC || car.getEngine() == EngineType.HYBRID_ELECTRIC && !car.isBooked()){
                System.out.println(car);
            }
        }
    }

    public static void addCar(Car newCar){
        int len = Car.getFleet().length;
        Car[] carStock = Car.getFleet();
        Car[] temp = new Car[len + 1];
        temp[len] = newCar;
        for (int i = 0; i < len; i++){
            temp[i] = carStock[i];
        }
        Car.setFleet(temp);
        System.out.println();
        System.out.println(newCar.getBrand() + ", " + newCar.getModel() + " " + newCar.getEngine() + "  added successfully.");
    }

    public static void getAllCars(){
        Car[] allCars = Car.getFleet();
        int len = allCars.length;
        String status;
        System.out.println();
        System.out.println("Currently Available Cars: " );
        System.out.println("*************************");
        int kount = 0;
        for (int i = 0; i < len; i++){
            if (!allCars[i].isBooked()){
                System.out.println(allCars[i].getBrand() + " " + allCars[i].getModel() + " " + allCars[i].getCarNo());
                kount++;
            }
        }
        System.out.println();
        System.out.println(kount + " cars available.");
    }

}

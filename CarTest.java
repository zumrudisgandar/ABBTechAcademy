package Lesson4.Lesson4Exercise;

public class CarTest {
    public static void main(String[] args) {
        String brand = "Tesla";
        String model = "Model S";
        int year = 2012;
        String fuelType = "none";
        Car newCar = new Car(brand, model, year, fuelType);
        newCar.speed(60);
        System.out.println("Current speed: " + newCar.getSpeed());

        newCar.slow(10);
        System.out.println("Speed reduced to: " + newCar.getSpeed());

        newCar.checkSpeed(60);
    }
}

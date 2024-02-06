package Lesson4.Lesson4Exercise;

public class Car {
    String brand;
    String model;
    int yearOfProduction;
    String fuelType;
    double speed;

    // constructor
    public Car (String brand, String model, int year, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = year;
        this.fuelType = fuelType;
        this.speed = 0;
    }

    // methods
    public void speed(double speedIncrementAmount) {
        speed += speedIncrementAmount;
    }

    public void slow(double speedReductionAmount) {
        speed -= speedReductionAmount;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void stop() {
        speed = 0;
    }

    public void checkSpeed(double limit) {
        if (speed > limit) {
            System.out.println("WARNING: Your speed exceeds the limit. Slow down!");
        } else {
            System.out.println("Your speed does not exceed the limit.");
        }
    }

    // getters and setters
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

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

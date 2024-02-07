package Lesson4;

public class Car {

    // - Create a class named Car with instance variables like model, year, and a method startEngine().
    String model;
    int year;

    public void setModel (String model) {
        this.model = model;
    }

    public String getModel () {
        return this.model;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public int getYear () {
        return this.year;
    }

    String startEngine(String model, int year) {
        return model;
    }

}

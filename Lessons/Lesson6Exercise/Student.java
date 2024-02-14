package Lesson6Exercise;

public class Student {

    private int id;
    static private int idCounter = 1;
    private String name;
    private int age;

    // AS ID INCREASES EACH TIME WE CREATE A NEW STUDENT, THE ID WILL BE UNIQUE.
    {
        id = idCounter;
        idCounter++;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

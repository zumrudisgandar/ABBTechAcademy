package Lesson6Exercise;

public class Teacher {
    private  int id;
    private static int idCount = 1;
    private String name;
    private int age;

    // AS ID INCREASES EACH TIME WE CREATE A NEW TEACHER, THE ID WILL BE UNIQUE.
    {
        id = idCount;
        idCount++;
    }
    public Teacher(String name, int age) {
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

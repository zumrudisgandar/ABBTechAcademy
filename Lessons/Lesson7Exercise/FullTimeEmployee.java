public class FullTimeEmployee implements Employee{

    private String name;
    private double experience;
    private double salary;

    public FullTimeEmployee(String name, double experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }
}

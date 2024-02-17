public class PartTimeEmployee implements Employee {

    private String name;
    private double experience;
    private double workedHours;
    private double salaryPerHour;

    public PartTimeEmployee(String name, double experience, double workedHours, double salaryPerHour) {
        this.name = name;
        this.experience = experience;
        this.workedHours = workedHours;
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public double getSalary() {
        return workedHours * salaryPerHour;
    }
}

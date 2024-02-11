package Lesson5Exercise;


// Task 1
interface Employee {
    double calculateSalary();
    void displayDetails();
}

class FullTimeEmployee implements Employee {
    String name;
    int id;
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Details of full-time employee:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Monthly salary: " + calculateSalary());
        System.out.println();
    }
}

class PartTimeEmployee implements Employee {
    String name;
    int id;
    double hourlyRate;
    double hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("Details of part-time employee:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}
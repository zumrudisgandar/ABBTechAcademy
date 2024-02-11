package Lesson5Exercise;


// Task 1
public class Main {
    public static void main (String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new FullTimeEmployee("John", 1, 4000);
        employees[1] = new FullTimeEmployee("Kate", 2, 3500);
        employees[2] = new PartTimeEmployee("Alex", 3, 30, 100.5);
        employees[3] = new PartTimeEmployee("Ada", 4, 25.5, 80);

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
        }
    }
}

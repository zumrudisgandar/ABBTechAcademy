import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        double salary1 = emp1.getSalary();
        double salary2 = emp2.getSalary();
        return Double.compare(salary1, salary2);
    }
}

public class CheckEmployee {
    public static void main (String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        TreeSet<Employee> sortedEmployees = new TreeSet<>(new EmployeeComparator());
        HashMap <String, Employee> minMaxSalaries = new HashMap<>();

        // create full-time employees
        FullTimeEmployee FTEmployee1 = new FullTimeEmployee("Jonas", 5, 7500);
        FullTimeEmployee FTEmployee2 = new FullTimeEmployee("Kate", 2.5, 4200);
        FullTimeEmployee FTEmployee3 = new FullTimeEmployee("Henry", 10, 10000);
        FullTimeEmployee FTEmployee4 = new FullTimeEmployee("Alex", 1.5, 2000);
        FullTimeEmployee FTEmployee5 = new FullTimeEmployee("James", 3, 5000);

        // add full-time employees to ArrayList
        employees.add(FTEmployee1);
        employees.add(FTEmployee2);
        employees.add(FTEmployee3);
        employees.add(FTEmployee4);
        employees.add(FTEmployee5);

        // create part-time employees
        PartTimeEmployee PTEmployee1 = new PartTimeEmployee("Ada", 1, 20, 50);
        PartTimeEmployee PTEmployee2 = new PartTimeEmployee("Martha", 2.4, 25, 80);
        PartTimeEmployee PTEmployee3 = new PartTimeEmployee("Lukas", 1.5, 30, 73);
        PartTimeEmployee PTEmployee4 = new PartTimeEmployee("David", 8, 40, 300);
        PartTimeEmployee PTEmployee5 = new PartTimeEmployee("Maria", 7, 35, 250);

        // add part-time employees to ArrayList
        employees.add(PTEmployee1);
        employees.add(PTEmployee2);
        employees.add(PTEmployee3);
        employees.add(PTEmployee4);
        employees.add(PTEmployee5);

        // sort the employees who have experience more than 2 years and store them in sortedEmployees
        for (Employee employee : employees) {
            if (employee.getExperience() > 2) {
                sortedEmployees.add(employee);
            }
        }

        System.out.println("Sorted employees based on their salaries: ");
        for (Employee employee : sortedEmployees) {
            System.out.println("Employee name: " + employee.getName() + ", employee experience " + employee.getExperience() + ", employee salary " + employee.getSalary());
        }
        System.out.println();

        // find employees with min and max salaries and put them into Map
        Employee employeeMinSalary = null;
        Employee employeeMaxSalary = null;
        double minSalary = 1000000000;
        double maxSalary = 0;

        for (Employee employee : sortedEmployees) {
            if (employee.getSalary() < minSalary) {
                employeeMinSalary = employee;
                minSalary = employee.getSalary();

            }
            if (employee.getSalary() > maxSalary) {
                employeeMaxSalary = employee;
                maxSalary = employee.getSalary();
            }
        }

        minMaxSalaries.put("Employee with min salary: ", employeeMinSalary);
        minMaxSalaries.put("Employee with max salary: ", employeeMaxSalary);

        System.out.println("Employees with Min and Max salaries: ");
        for (HashMap.Entry<String, Employee> entry : minMaxSalaries.entrySet()) {
            System.out.println(entry.getKey() + "Name - " + entry.getValue().getName() + ", Salary - " + entry.getValue().getSalary());
        }
    }
}

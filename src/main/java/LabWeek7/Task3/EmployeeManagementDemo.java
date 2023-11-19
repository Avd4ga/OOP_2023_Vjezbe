package LabWeek7.Task3;

import java.util.List;

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        // Instantiate EmployeeManagementSystem
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        // Create a list of employees
        List<Employee> employees = List.of(
                new Employee(1, "John Doe", 50000.0),
                new Employee(2, "Jane Smith", 60000.0),
                new Employee(3, "Bob Johnson", 75000.0),
                new Employee(4, "Alice Brown", 80000.0)
        );

        // Use filterEmployeesBySalary method
        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, 70000.0);

        // Use calculateTotalSalary method
        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);

        // Use displayEmployeeDetails method
        System.out.println("Filtered Employees:");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);

        System.out.println("Total Salary of All Employees: $" + totalSalary);
    }
}

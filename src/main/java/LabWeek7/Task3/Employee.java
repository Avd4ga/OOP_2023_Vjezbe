package LabWeek7.Task3;

import java.util.ArrayList;
import java.util.List;

record Employee(int id, String name, double salary) {}

class EmployeeManagementSystem {
    List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.salary() >= minSalary) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }

    void displayEmployeeDetails(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.id() + ", Name: " + employee.name() + ", Salary: $" + employee.salary());
        }
    }
}

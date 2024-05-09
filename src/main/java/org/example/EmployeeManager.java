package org.example;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private Map<Employee, Double[]> employeeBonusesAndDeductions; // Map to store bonuses and deductions for each employee

    // Constructor
    public EmployeeManager() {
        employeeBonusesAndDeductions = new HashMap<>();
    }

    // Method to add employee with their bonuses and deductions
    public void addEmployee(Employee employee, Double bonus, Double deductions) {
        employeeBonusesAndDeductions.put(employee, new Double[]{bonus, deductions});
    }

    // Method to calculate and display the total monthly salary of all employees
    public void displayTotalMonthlySalaryForAllEmployees() {
        System.out.println("Total monthly salary for all employees:");
        for (Map.Entry<Employee, Double[]> entry : employeeBonusesAndDeductions.entrySet()) {
            Employee employee = entry.getKey();
            Double[] bonusesAndDeductions = entry.getValue();
            double totalSalary = employee.calculateMonthlySalary(bonusesAndDeductions[0], bonusesAndDeductions[1]);
            System.out.println("Name: " + employee.getName());
            System.out.println("Total Monthly Salary: " + totalSalary);
            System.out.println();
        }
    }

    // Method to display information of all employees
    public void displayInformationOfAllEmployees() {
        System.out.println("Information of all employees:");
        for (Employee employee : employeeBonusesAndDeductions.keySet()) {
            employee.displayInformation();
            System.out.println();
        }
    }

}

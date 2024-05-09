package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();

        // Add employees
        Employee employee1 = new Employee("John", 30, 2000, null, null);
        Employee employee2 = new Employee("Mary", 35, 2500, null, null);
        Employee employee3 = new Employee("Peter", 28, 1800, null, null);

        employeeManager.addEmployee(employee1, 5.0, 100.0); // John 5% bonus and $100 deductions
        employeeManager.addEmployee(employee2, null, 50.0); // Mary has no bonus and $50 deductions
        employeeManager.addEmployee(employee3, 3.0, 80.0); // Peter 3% bonus and $80 deductions

        System.out.println("What do you want to do?");
        System.out.println("1. Show information of all employees");
        System.out.println("2. Calculate total monthly salary for all employees");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                employeeManager.displayInformationOfAllEmployees();
                break;
            case 2:
                employeeManager.displayTotalMonthlySalaryForAllEmployees();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
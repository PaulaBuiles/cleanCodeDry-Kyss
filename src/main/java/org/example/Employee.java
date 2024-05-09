package org.example;

public class Employee {
    private String name;
    private int age;
    private double monthlyBaseSalary;
    private Double bonusPercentage; // Nullable
    private Double deductions; // Nullable


    public Employee(String name, int age, double monthlyBaseSalary, Double bonusPercentage, Double deductions) {
        this.name = name;
        this.age = age;
        this.monthlyBaseSalary = monthlyBaseSalary;
        this.bonusPercentage = bonusPercentage;
        this.deductions = deductions;
    }

    // Method to calculate the monthly salary with optional parameters for bonus and deductions
    public double calculateMonthlySalary(Double bonus, Double deductions) {
        double totalSalary = monthlyBaseSalary;

        if (bonus != null && bonus > 0) {
            double bonusAmount = monthlyBaseSalary * (bonus / 100);
            totalSalary += bonusAmount;
        }

        if (deductions != null && deductions > 0) {
            totalSalary -= deductions;
        }

        return totalSalary;
    }

    // Method to display employee information
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: " + monthlyBaseSalary);
    }

    public String getName() {
        return name;
    }

}

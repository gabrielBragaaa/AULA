package org.example.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public final int valueForDays = 50;

    public String toString() {
        return name
                + ", "
                + "$ "
                + String.format("%.2f", netSalary());
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
        return grossSalary += grossSalary / percentage - tax;
    }
}

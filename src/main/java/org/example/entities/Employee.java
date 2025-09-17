package org.example.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public String toString() {
        return "Employee: "
                + name
                + ", "
                + "$ "
                + String.format("%.2f",grossSalary);
    }

    public double netSalary() {
        return grossSalary - tax;
    }

}

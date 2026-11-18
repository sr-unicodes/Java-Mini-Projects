package com.employee.core;

import com.employee.models.Employee;
import com.employee.models.FullTimeEmployee;
import com.employee.models.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee("Alice Smith", 101, 85000.0);
        PartTimeEmployee pte = new PartTimeEmployee("Bob Jones", 102, 25.50, 80);


        Employee[] companyRoster = {fte, pte};

        System.out.println("--- Monthly Payroll Processing ---");

        for (Employee emp : companyRoster) {
            System.out.println("Employee ID: " + emp.getId() + " | Name: " + emp.getName());
            System.out.println("Salary to Pay: $" + emp.calculateSalary());
            System.out.println("----------------------------------");
        }
    }
}

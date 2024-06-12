package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class InlineClassEx {


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alex", 2500));
        employees.add(new Employee(2, "John", 2000));
        employees.add(new Employee(3, "David", 3000));

        // sort employees by salary
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        employees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));


    }
}

//
// In the above example, the  Employee  class is used to represent an employee. The  EmployeeSalaryComparator  class is used to compare employees based on their salary.
// The  EmployeeSalaryComparator  class is used only in one place in the code. So, we can inline the  EmployeeSalaryComparator  class into the  InlineClassEx  class.
// Let's inline the  EmployeeSalaryComparator  class into the  InlineClassEx  class.
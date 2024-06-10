package com.example.creational.builder;

public class Employee {

    private  int id;
    private  String name;
    private  double salary;
    private  String dept;
    private  String designation;

    private Employee(int id, String name, double salary, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.designation = designation;
    }

    public static class EmployeeBuilder {
        private  int id;
        private  String name;
        private  double salary=1000.00;
        private  String dept;
        private  String designation;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setDept(String dept) {
            this.dept = dept;
            return this;
        }

        public EmployeeBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, salary, dept, designation);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", desg='" + designation + '\'' +
                '}';
    }

}

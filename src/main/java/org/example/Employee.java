package org.example;

import java.util.List;

public class Employee {
    private String name;
    private String phoneNumber;
    private String position;
    private double salary;
    private int age;


    public Employee(String name, String phoneNumber, String position, double salary, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String showEmployee() {
        return "Employee: " + name + ", Phone number: "
                + phoneNumber + ",Position: "
                + position + ", Salary:"
                + salary + ", Age: "
                + age;
    }


    public static float averageAge(List<Employee> employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        float average = sum / employees.size();
        return average;
    }

    public static float averageSalary(List<Employee> employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        float average = sum / employees.size();
        return average;


    }
}

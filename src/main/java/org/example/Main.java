package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Igor", "123456789", "Manager", 40000, 50);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "123456789", "Security", 10000, 70));
        employees.add(new Employee("Jane", "987654321", "Assistant", 5000, 25));
        employees.add(new Employee("Jack", "123123123", "Assistant", 5000, 25));
        employees.add(new Employee("Jill", "321321321", "Assistant", 5000, 25));
        employees.add(new Employee("James", "456456456", "Assistant", 5000, 25));
        employees.add(new Employee("Jenny", "654654654", "Secretary", 5000, 66));
        employees.add(manager);


        for (Employee employee : employees) {
            manager.salaryIncrease(employee, 25, 35);

            System.out.println(employee.showEmployee());

        }

        System.out.println("Average salary: " + Employee.averageSalary(employees));
        System.out.println("Average age: " + Employee.averageAge(employees));



        ComparableByAge comparableByAge = new ComparableByAge();
        ComparableBySalary comparableBySalary = new ComparableBySalary();

        Collections.sort(employees, comparableBySalary);
        System.out.println("Sorted list by salary:");
        for (Employee employee : employees) {
            System.out.println(employee.showEmployee());

        }

        Collections.sort(employees, comparableByAge);
        System.out.println("Sorted list by age:");
        for (Employee employee : employees) {
            System.out.println(employee.showEmployee());

        }

    }
}

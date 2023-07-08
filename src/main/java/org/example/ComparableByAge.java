package org.example;

import java.util.Comparator;

public class ComparableByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getAge() > employee2.getAge()) {
            return 1;
        } else if (employee1.getAge() < employee2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

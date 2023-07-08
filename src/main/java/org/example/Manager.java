package org.example;

public class Manager extends Employee {
    public Manager(String name, String phoneNumber, String position, double salary, int age) {
        super(name, phoneNumber, position, salary, age);
    }


    public  void salaryIncrease(Employee employee, int age, double salary){

        if(employee.getAge() > age && !employee.getPosition().equals("Manager") ){
            employee.setSalary(employee.getSalary()+salary);
        }

    }


}

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the runnable");
            System.out.println("line2");
            System.out.println("line3");
        }).start();

        Employee john = new Employee("Johnny", 93);
        Employee cat = new Employee("Captain Cat", 3);
        Employee tom = new Employee("Tom Hardy", 35);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(john);
        employees.add(cat);
        employees.add(tom);

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees){
            System.out.println(employee.getName());
        }
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
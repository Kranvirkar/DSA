package com.scaler.dsa1.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    static class Employee {
        String name;
        int age;
        double salary;
        boolean active;

        Employee(String name, int age, double salary, boolean active) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.active = active;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Employee> employees = List.of(
                new Employee("Alice", 30, 80000, true),
                new Employee("Bob", 45, 120000, false),
                new Employee("Charlie", 28, 95000, true),
                new Employee("Diana", 40, 110000, true)
        );
        //Even
        List<Integer> evenList = numbers.stream()
                .filter(e -> e % 2 == 0)
                .toList();

        System.out.println("Even List :"+evenList);


        // Filter: active employees over 35 with salary > 1L
        List<Employee> employee35 = employees.stream()
                .filter(e -> e.active && e.age > 35 && e.salary > 1000)
                .toList();

        employee35.forEach(e ->
                System.out.println(e.name + " - Age: " + e.age + ", Salary: " + e.salary)
        );

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(squares); // [1, 4, 9, 16]
    }
}

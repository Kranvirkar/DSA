package com.scaler.dsa1.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sorting {
    public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1,"Alice", 70000, "IT"),
                    new Employee(3,"Bob", 90000, "Finance"),
                    new Employee(2,"Eve", 80000, "Marketing"),
                    new Employee(5,"Charlie", 85000, "HR"),
                    new Employee(4,"David", 95000, "IT")

            );
            //find Employee name
            employees.stream()
                .forEach(e-> System.out.println(e.getName()));
        System.out.println();
            //sortby Employee name
        System.out.println("sortby Employee name");
        employees.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
        System.out.println();

        //sortby Employee name and id
        System.out.println("sortby Employee name and id");
        employees.stream().sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getId))
                .forEach(System.out::println);
        System.out.println();

        //reverse order by name
        System.out.println("reverse order by name");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(System.out::println);
        System.out.println();

        //reverse order by name and id
        System.out.println("reverse order by name and id");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId).reversed())
                .forEach(System.out::println);
        System.out.println();

        //third highest salary
        System.out.println("third highest salary");
        Optional<Employee> first = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst();
        System.out.println(first.get());
        System.out.println();
    }
}

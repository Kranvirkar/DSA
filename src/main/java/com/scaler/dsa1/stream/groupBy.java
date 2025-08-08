package com.scaler.dsa1.stream;

import java.util.*;
import java.util.stream.Collectors;

public class groupBy {
    public static void main(String[] args) {
        List<Employee> employees =List.of(
                new Employee(1,"Alice", 70000, "IT"),
                new Employee(3,"Bob", 90000, "Finance"),
                new Employee(2,"Eve", 823000, "Marketing"),
                new Employee(10,"rk", 802000, "Marketing"),
                new Employee(9,"kingrk", 803000, "Marketing"),
                new Employee(8,"king", 823000, "Marketing"),
                new Employee(5,"Charlie", 85000, "HR"),
                new Employee(6,"Charl", 853000, "HR"),
                new Employee(8,"kiran", 850400, "HR"),
                new Employee(7,"karan", 850040, "HR"),

                new Employee(4,"David", 95000, "IT")

        );

        // count department employee
        System.out.println();
        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);
        System.out.println();

        //deparmrnt with higest employee
        String noEmployee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No Employee");
        System.out.println(noEmployee);

        //deparmrnt wise with higest salary
        Map<String, Optional<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparingInt(Employee::getSalary))));

                collect1.forEach((key,value)-> System.out.println(value.get().getSalary()));

        //System.out.println(collect1);
    }
}

package com.scaler.dsa1.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Sort {

    static class Person {
        String name;
        int age;
        Person(String name, int age) { this.name = name; this.age = age; }

        int getAge(){
            return age;
        }
        
        String getName(){
            return name;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        List<String> names = Arrays.asList("Kiran", "Alex", "John");

        List<Person> people = Arrays.asList(
                new Person("Kiran", 25),
                new Person("John", 30),
                new Person("Alex", 28)
        );

        List<Integer> naturalSort = numbers.stream()
                .sorted()
                .toList();

        System.out.println("Natural sort: "+naturalSort);

        //reverse sort
        List<String> reverseSort = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reverse sort: "+reverseSort);

        List<Person> sortAge = people.stream()
                .sorted(Comparator.comparing(e->e.age))
                .toList();

        System.out.println("Sort Age: "+sortAge);

        List<Person> revSortAge = people.stream()
                .sorted(Comparator.comparing(Person ::getAge, Comparator.reverseOrder())
                        .thenComparing(Person::getName))
                .toList();

        System.out.println("Reverse Sort Age: "+revSortAge);

        List<Person> revSortAge1 = people.stream()
                .sorted(Comparator.comparing(e->e.age,Comparator.reverseOrder()))
                .toList();

        System.out.println("Reverse Sort Age1: "+revSortAge1);


    }
}

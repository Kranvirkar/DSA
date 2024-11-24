package com.scaler.dsa1.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllElements {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 66, 6, 7, 8);
        List<String> courses = List.of("Spring","Spring boot", "Api","Microservice","AWS","Azure","Docker","Kubernets");
        //printAllElmt(numbers);
        //printEvenElement(numbers);
        //printContainningSpring(courses);
        //printCourseContainAtleast4Letteres(courses);
        //printSquareEvenElement(numbers);
        //printCharacterInCourses(courses);
        //sumOfAllElements(numbers);
        //minValue(numbers);
        //maxValue(numbers);
        reverseList(courses);
        reverseListLengthOfString(courses);
    }

    private static void reverseListLengthOfString(List<String> courses) {
        List<String> list=courses.stream()
                .sorted(Comparator.comparing(str->str.length()))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void reverseList(List<String> courses) {
    List<String> list= courses.stream()
            .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
    }

    private static void maxValue(List<Integer> numbers) {
    Integer max=numbers.stream()
            .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println(max);
    }

    private static void minValue(List<Integer> numbers) {
        Integer min=numbers.stream()
                .reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
        System.out.println(min);
    }

    private static void sumOfAllElements(List<Integer> numbers) {
        /*int sum=0;
        for (Integer tmp:numbers) {
            sum+=tmp;
        }
        System.out.println(sum);*/

        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }

    private static void printCharacterInCourses(List<String> courses) {
        courses.stream()
                .map(course->course.length())
                .forEach(System.out::println);
    }

    private static void printSquareEvenElement(List<Integer> numbers) {
    numbers.stream().filter(num->num%2==0)
            .map(tmp->tmp*tmp)
            .forEach(System.out::println);
    }

    //printCourseContainAtleast4Letteres
    private static void printCourseContainAtleast4Letteres(List<String> courses) {
    courses.stream().filter(course-> course.length() >=4)
            .forEach(System.out::println);
    }

    // printContainningSpring
    private static void printContainningSpring(List<String> courses) {
    courses.stream().filter(course->course.contains("Spring"))
            .forEach(System.out::println);
    }

    //// PrintEvenElement
    private static void printEvenElement(List<Integer> numbers) {
        /* for (Integer tmp:numbers){
            if(tmp%2==0){
                System.out.println(tmp);
            }
        }*/
        numbers.stream().filter(even->even%2==0)
                .forEach(System.out::println);

    }

    public static void printElement(int num) {
        System.out.println(num);
    }

    // PrintAllElement
    private static void printAllElmt(List<Integer> numbers) {
        /* for (Integer tmp:numbers){
            System.out.println(tmp);
        }*/
       // numbers.stream().forEach(PrintAllElements::printElement);
        numbers.stream().forEach(System.out::println);
    }
}

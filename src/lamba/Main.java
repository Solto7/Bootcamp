package lamba;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//
//          List<String> strings = new ArrayList<>();
//        strings.add("Manas");
//        strings.add("Aiperi");
//        strings.add("Isken");
//        strings.add("Baha");
//        strings.add("Aidar");
//        strings.add("Bakai");
//        strings.stream().forEach(name -> name.contains("1"));
//
//
//        }
//    public List<Integer> doubling(List<Integer> nums) {
//        List<Integer> newNums = new ArrayList<>();
//        nums.stream().forEach(num -> newNums.add(num * 2));
//        return newNums;

        Person person = new Person("inkognito","private",12);
        Person asan = new Person("Asan","Daniyarov",23);
        Person manas = new Person("Manual","QA",12);
        Person aidin = new Person("Aidin","Iskenderov",17);
        Person kulpunay = new Person("Kulpunai","Barakanova",18);

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(asan);
        persons.add(manas);
        persons.add(aidin);
        persons.add(kulpunay);

        List<Integer> collect = persons.stream().map(Person::getAge).collect(Collectors.toList());
        List<Integer> integers = new LinkedList<>();
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        List<Integer> collect1 = integers.stream().map(i -> i *2).collect(Collectors.toList());
        System.out.println(collect1);
        //       Aidin     --> stream.peek();
//        Janyla    --> stream.reduce();
//        Asan      --> collect1.stream().allMatch();
//                      collect1.stream().anyMatch();
//
//        Aigerim   --> collect1.stream().dropWhile();
//                      collect1.stream().takeWhile();
//        Manas     --> collect1.stream().forEachOrdered();
//        Abdusamat --> collect1.stream().max();
//                      collect1.stream().min();
//        Aigerim Asakunova --> collect1.stream().flatMap()
    }
    }

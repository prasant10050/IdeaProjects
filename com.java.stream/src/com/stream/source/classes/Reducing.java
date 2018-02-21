package com.stream.source.classes;

import com.stream.source.classes.model.Person;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {
        List<Person> listPerson=new ArrayList<>();
        listPerson.add(new Person(101,"Sonu",3400.00,"Asanosl",29));
        listPerson.add(new Person(103,"Monu",4400.00,"Asanosl",27));
        listPerson.add(new Person(102,"Rahul",3560.00,"Ranchi",24));
        listPerson.add(new Person(105,"Prasant",3190.00,"Bengaluru",30));
        listPerson.add(new Person(104,"Ashutosh",5400.00,"Mysore",21));
        Stream<Person> stream = listPerson.stream();
        //Double totalSalary = stream.map(Person::getSalary).reduce(0.00, (a, b) -> a + b);
        //Double totalSalary = stream.reduce(0.00, (partialSum, person) -> partialSum + person.getSalary(), Double::sum);
        Double totalSalary = stream.reduce(0.00, (partialResult, person) -> partialResult + person.getSalary(), (a, b) -> {
            System.out.println("Combiner -> a= " + a + " b= " + b);
            return a + b;
        });
        //System.out.println("Total Salary "+totalSalary);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 5, 7, 9, 10, 0, 100, 201, 21, 450, 8, 7, 9, 10);
        Optional<Integer> maxNumber = integerList.stream().reduce(Integer::max);
        if (maxNumber.isPresent()){
            System.out.println("Maximum no. "+maxNumber);
        }
        else {
            System.out.println("Number is not defined");
        }

        Stream<Integer> integerStream = Stream.of(12, 34, 0, -1, 56, 67, 9);
        Optional<Integer> optionalInteger=Stream.<Integer>empty().reduce(Integer::max);
        Optional<Integer> maxInt = integerStream.reduce(Integer::max);
        if(optionalInteger.isPresent()){
            System.out.println("Maximum is "+optionalInteger);
        }else {
            System.out.println("max is not defined");
        }
        if(maxInt.isPresent()){
            System.out.println("Maximum is -> "+maxInt);
        }else {
            System.out.println("max is not defined!!");
        }
        Optional<Person> personMaxSalary = listPerson.stream().reduce((p1, p2) -> p1.getSalary() > p2.getSalary() ? p1 : p2);
        if(personMaxSalary.isPresent()){
            System.out.println("Max salary of Person -> "+personMaxSalary);
        }
        else {
            System.out.println("Not defined");
        }

        double totalSal = listPerson.stream().mapToDouble(Person::getSalary).sum();
        System.out.println("Total Salary ->"+totalSal);

        OptionalDouble max = listPerson.stream().mapToDouble(Person::getSalary).max();
        OptionalDouble min = listPerson.stream().mapToDouble(Person::getSalary).min();
        OptionalDouble average = listPerson.stream().mapToDouble(Person::getSalary).average();
        System.out.println("Max & Min -> "+max + min+" Avg -> "+average);

        Optional<Person> max1 = listPerson.stream().max(Comparator.comparingDouble(Person::getSalary));
        Optional<Person> min1 = listPerson.stream().min(Comparator.comparingDouble(Person::getSalary));
        System.out.println("Max -> "+max1);
        System.out.println("Min -> "+min1);

        long count = listPerson.stream().count();
        System.out.println(count);
        double count1 = listPerson.stream().mapToDouble(p -> 1D).sum();
        System.out.println(count1);
        double count2 = listPerson.stream().mapToDouble(p -> 1D).reduce(0, Double::sum);
        Double count3 = listPerson.stream().reduce(0D, (partialSum, person) -> partialSum + 1D, Double::sum);
        System.out.println(count2);
        System.out.println(count3);
    }
}

package com.stream.source.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkWithStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 30);
        //intStream.filter(n->n%2==0).forEach(System.out::println);
        List<Integer> integers = Arrays.asList(1, 3, 45, 56, 0, 66, 56, 66, 78, 2, 300, 100, 300, 453, 230, 310, 600,453,453,310,3);
        //integers.stream().filter(n->n>100).distinct().forEach(System.out::println);
        Stream<Integer> integerStream = integers.stream().filter(n -> n >= 300);
        //integerStream.skip(2).forEach(System.out::println);

        System.out.println("-------------------");
        //integerStream.limit(3).forEach(System.out::println);
        List<String> strings = Arrays.asList("Hello", "World", "Bing");
        //Stream<String> stream = strings.stream();
        //stream.map(n -> n.length()).forEach(System.out::println);
        strings.stream().map(n->n.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
    }
}

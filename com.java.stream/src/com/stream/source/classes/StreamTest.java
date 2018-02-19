package com.stream.source.classes;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        /*Stream<String> streams=Stream.of("Sonu","Monu","Rahul","Sanjay");
        streams.forEach(p-> System.out.println(p));
        //streams=Stream.of(1,2,3,4,5);
        Stream<String> stream1= Stream.<String>builder()
                .add("Gobind")
                .add("Aman")
                .add("Piyush")
                .add("Manjay")
                .build();
        stream1.forEach(p-> System.out.println(p));*/

        /*Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("one").add("two").add("three")
                .build();
        List<String> list = stream.map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list);

        Stream.Builder<String> b = Stream.builder();
        b.accept("a");
        b.accept("b");
        b.accept("c");
        b.accept("d");
        b.accept("e");

        Stream<String> s = b.build();
        s.forEach(System.out::println);*/

        /*IntStream range = IntStream.range(1, 5);
        range.forEach(p-> System.out.println(p));

        Stream.Builder<Integer> b=Stream.builder();
        b.accept(1);
        b.accept(2);
        b.accept(3);
        Stream<Integer> build = b.build();
        build.forEach(p-> System.out.println(p));

        IntStream intStream = IntStream.rangeClosed(1, 6);
        intStream.forEach(p-> System.out.println(p));*/

        Stream<Date> generate = Stream.generate(() -> {
            return new Date();
        }).limit(4);
        generate.forEach(p-> System.out.println(p));

    }
}

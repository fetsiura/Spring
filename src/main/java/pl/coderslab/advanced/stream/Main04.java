package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main04 {

    public static void main(String[] args) {

        List<String> strings = List.of("małpa", "ogórek", "Wielbłąd", "skoczyjadło", "alabaster", "gęś", "jaźń", "123", "wężymord", "topinambur");

        strings.stream()
                .map( String::length)
                .forEach(System.out::println);

        System.out.println("--------------");

        List<String> collect = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("--------------");

        strings.stream()
                .filter( s -> s.contains("c"))
                .forEach(System.out::println);

        System.out.println("--------------");

        int sum = strings.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
        System.out.println("--------------");

        strings.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

    }
}

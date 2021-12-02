package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main04 {

    public static void main(String[] args) {
        List<String> strings = List.of("małpa", "ogórek", "Wielbłąd", "skoczyjadło", "alabaster", "gęś", "jaźń", "123", "wężymord", "topinambur");

        System.out.println("---- Długości:");
        strings.stream()
                .map(String::length) // (String s) -> s.length()
                .forEach(System.out::println);

        System.out.println("---- Posortowane:");
        List<String> sorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

        System.out.println("---- Zawierają c:");
        strings.stream()
                .filter(s -> s.contains("c"))
                .forEach(System.out::println);

        System.out.println("---- Długość wszystkich:");
        int lengthSum = strings.stream()
                .mapToInt(String::length) // (String s) -> s.length()
                .sum();
        System.out.println(lengthSum);

        System.out.println("---- Długość wszystkich (redukcja):");
        Integer reducedLengthSum = strings.stream()
                .map(String::length)
                .reduce(0, Integer::sum); // (Integer a, Integer b) -> a + b
        System.out.println(reducedLengthSum);

        System.out.println("---- Pierwsze trzy:");
        List<String> firstThreeString = strings.stream()
                .limit(3)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(firstThreeString);
    }
}

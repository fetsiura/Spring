package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main01 {

    public static void main(String[] args) {


        List<String> strings = List.of("małpa", "ogórek", "Wielbłąd", "skoczyjadło", "alabaster", "gęś", "jaźń", "123", "wężymord", "topinambur", "małpa", "ogóra");


        strings.stream()
                .filter( s -> s.startsWith("a") || s.startsWith("s"))
                .sorted()
                .forEach(System.out::println);


        List<String> collect = strings.stream()
                .filter(s -> s.length() == 5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = strings.stream()
                .map(s -> s.substring(0, Math.min(s.length(), 3)))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect1);


    }
}

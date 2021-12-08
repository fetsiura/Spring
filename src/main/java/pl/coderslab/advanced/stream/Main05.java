package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main05 {

    public static void main(String[] args) {


        List<String> strings = List.of("małpa", "ogórek", "Wielbłąd", "skoczyjadło", "alabaster", "gęś", "jaźń", "123", "wężymord", "topinambur");


        Map<String, String> collect = strings.stream()
                .collect(Collectors.toMap(k -> k, v -> new StringBuilder(v).reverse().toString()));

        collect.forEach((k,v) -> System.out.println(k +"-"+v));
    }
}

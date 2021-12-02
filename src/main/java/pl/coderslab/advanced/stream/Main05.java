package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main05 {

    public static void main(String[] args) {

        List<String> strings = List.of("małpa", "ogórek", "Wielbłąd", "skoczyjadło", "alabaster", "gęś", "jaźń", "123", "wężymord", "topinambur");

        Map<String, String> reversedStringsMap =
                strings.stream()
                        .collect(Collectors.toMap(
                                s -> s,
                                s -> new StringBuilder(s).reverse().toString()
//                                ,(oldValue, newValue) -> oldValue.concat(newValue) // opcjonalnie, gdyby w strumieniu były powtórzenia
                        ));
        System.out.println(reversedStringsMap);
    }
}

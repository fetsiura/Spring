package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main01 {

    public static void main(String[] args) {
        List<String> strings = List.of("małpa", "ogórek", "Wielbłąd", "skoczyjadło", "alabaster", "gęś", "jaźń", "123", "wężymord", "topinambur", "małpa", "ogóra");

        //    wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające się na literę „a” lub „s”, posortowane alfabetycznie
        // 1. wypisanie na ekranie -> forEach
        // 2. zamiana na wielkie litery -> map
        // 3. filtrowania zaczynajacych się na "a" lub "s" -> filter

        for (String string : strings) {
            if (string.startsWith("a") || string.startsWith("s")) {
                String pl = string.toUpperCase(Locale.forLanguageTag("pl"));
                System.out.println(pl);
            }
        }

        strings.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(s -> s.toUpperCase(Locale.forLanguageTag("pl")))
                .sorted()
                .forEach(s -> System.out.println(s));

        //    zwróci listę, która powstanie poprzez wybranie z listy unikalnych łańcuchów o długości równej 5
        // 1. zwróci listę -> collect
        // 2. unikalne wartości -> distinct
        // 3. łańcuchy o długości równej 5 -> filter

        List<String> list1 = strings.stream()
                .filter(s -> s.length() == 5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list1);

        //    utworzy obiekt typu String, zbudowany z posortowanych elementów listy ograniczonych do 3 pierwszych znaków każdego elementu, oddzielonych przecinkami
        // 1. Utworzy obiekt typu String z elementów odzielonych przecinkami -> collect [ Collectors.joining ]
        // 2. Posortowane elementy -> sorted
        // 3. Tylko pierwsze 3 znaki z każdego elementu -> map

        String joinedStr = strings.stream()
                .map(s -> s.substring(0, Math.min(s.length(), 3)))
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(joinedStr);
    }
}

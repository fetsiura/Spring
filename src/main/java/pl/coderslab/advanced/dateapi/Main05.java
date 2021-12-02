package pl.coderslab.advanced.dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.stream.Stream;

public class Main05 {

    public static void main(String[] args) {
        LocalDate christmas = LocalDate.of(2019, Month.DECEMBER, 24);

        Stream.iterate(christmas, date -> date.isBefore(LocalDate.of(2030, 1, 1)), date -> date.plusYears(1))
                .map(LocalDate::getDayOfWeek)
                .map(dayOfWeek -> dayOfWeek.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pl")))
                .forEach(System.out::println);
    }
}

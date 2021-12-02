package pl.coderslab.advanced.dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main07 {

    public static void main(String[] args) {
        LocalDate unixStart = LocalDate.of(1900, Month.JANUARY, 1);
        Period period = unixStart.until(LocalDate.now());
        System.out.println(period.getYears() * 12 + period.getMonths());

    }
}

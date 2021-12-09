package pl.coderslab.advanced.dateapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main03 {

    public static void main(String[] args) {


        LocalDate epoch = LocalDate.ofEpochDay(0);

        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(epoch,now));
        System.out.println(ChronoUnit.WEEKS.between(epoch,now));
        System.out.println(ChronoUnit.YEARS.between(epoch,now));
    }
}

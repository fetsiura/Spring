package pl.coderslab.SpringDay4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {


        LocalDateTime date = LocalDateTime.now();

        System.out.println(date.getHour());

        System.out.println(date.getDayOfWeek());
    }
}

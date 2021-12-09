package pl.coderslab.advanced.dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Date;

public class Main01 {

    public static void main(String[] args) {

        int year = Integer.parseInt(String.valueOf(Year.now()));
        for(int i=year;i<=year+10;i++){
            LocalDate date = LocalDate.of(i, Month.DECEMBER, 24);
            System.out.println(String.valueOf(i+" - "+date.getDayOfWeek()));

        }
    }
}

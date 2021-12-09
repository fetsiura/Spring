package pl.coderslab.advanced.dateapi;

import java.time.LocalTime;
import java.util.Map;

public class Main02 {

    public static void main(String[] args) {


        Map<String, LocalTime> mapTime = MapTime.getMapTime();


        mapTime.entrySet().stream()
                .forEach( s-> System.out.println(s.getKey() +" - "+s.getValue()));
    }
}

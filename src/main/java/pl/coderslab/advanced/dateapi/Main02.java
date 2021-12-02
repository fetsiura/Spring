package pl.coderslab.advanced.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main02 {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(zone -> zone.startsWith("Europe"))
                .map(zone -> ZoneId.of(zone))
                .map(zoneId -> LocalTime.now(zoneId))
                // kroki opcjonalne BEGIN
                .map(localTime -> localTime.format(
                        DateTimeFormatter.ofPattern("HH:mm:ss")))
                .distinct()
                .sorted()
                // kroki opcjonalne END
                .forEach(System.out::println);
    }
}

package pl.coderslab.advanced.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main06 {

    public static Map<String, LocalTime> getMapTime() {
        return ZoneId.getAvailableZoneIds().stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        zone -> LocalTime.now(ZoneId.of(zone)))
                );
    }

    public static void main(String[] args) {
        System.out.println(getMapTime());
    }
}

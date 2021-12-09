package pl.coderslab.advanced.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.time.ZoneId.getAvailableZoneIds;

public class MapTime {



    public static Map<String, LocalTime> getMapTime(){
        Map<String, LocalTime> collect = getAvailableZoneIds().stream()
                .collect(Collectors.toMap( s -> s, time -> LocalTime.now(ZoneId.of(time))));

        return collect;
    }
}

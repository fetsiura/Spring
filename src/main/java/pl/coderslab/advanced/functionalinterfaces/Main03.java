package pl.coderslab.advanced.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Filter<Integer> evenFilter = new Filter<Integer>() {

            @Override
            public boolean check(Integer value) {
                return value % 2 == 0;
            }
        };

        Transform<String, Integer> transformToDashes = new Transform<String, Integer>() {
            @Override
            public String transform(Integer source) {
                return "-".repeat(source);
            }
        };

        List<String> dashes = create(numbers, evenFilter, transformToDashes);

        for (String s : dashes) {
            System.out.println(s);
        }
    }

    private static <T, S> List<T> create(List<S> source, Filter<S> filter, Transform<T, S> transformer) {
        List<T> destination = new ArrayList<>();
        for (S element : source) {
            if (filter.check(element)) {
                destination.add(transformer.transform(element));
            }
        }
        return destination;
    }
}

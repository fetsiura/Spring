package pl.coderslab.advanced.functionalinterfaces;

import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 10, 15, 20, 25, 30, 35, 50);
        Filter<Integer> lessThan20Filter = new LessThan20IntegerFilter();

        printList(integers, lessThan20Filter);

        Filter<Integer> evenIntegerFilter = new Filter<Integer>() {

            @Override
            public boolean check(Integer value) {
                return value % 2 == 0;
            }
        };

        System.out.println("-----------");
        printList(integers, evenIntegerFilter);

        System.out.println(evenIntegerFilter.getClass());

        System.out.println("-----------");
        Filter<Integer> oddIntegerFilter = v -> v % 2 != 0;

        printList(integers, oddIntegerFilter);

        System.out.println("-----------");
        printList(integers, v -> v % 3 == 0);

//        List<String> strings = List.of("1", "2", "3");
//
//        printList(strings, lessThan20Filter);
    }

    public static <T> void printList(List<T> list, Filter<T> filter) {
        for (T value : list) {
            if (filter.check(value)) {
                System.out.println(value);
            }
        }
    }
}

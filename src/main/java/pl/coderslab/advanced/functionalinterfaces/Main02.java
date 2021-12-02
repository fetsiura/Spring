package pl.coderslab.advanced.functionalinterfaces;

import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Integer> src = List.of(1, 5, 10, 15, 20, 25, 30, 35, 40);
//        List<Double> src = List.of(1., 5., 10., 15., 20., 25., 30., 35., 40.);
        Filter<Integer> integerFilter = new LessThan20IntegerFilter();
        Transform<Integer, Integer> reduceByOne = new ReduceByOneIntegerTransform();

        printList(src, integerFilter, reduceByOne);

        Filter<Integer> greaterThan5AndLessThan30 = new Filter<Integer>() {

            @Override
            public boolean check(Integer value) {
                return value > 5 && value < 30;
            }
        };

        Transform<String, Integer> transformToDashes = new Transform<String, Integer>() {
            @Override
            public String transform(Integer source) {
                if (source == null || source == 0) {
                    return "";
                }
                return "-".repeat(Math.max(0, source));
            }
        };

        printList(src, greaterThan5AndLessThan30, transformToDashes);
    }

    public static <T, S> void printList(List<S> src, Filter<S> filter, Transform<T, S> transformer) {
        for (S element : src) {
            if (filter.check(element)) {
                System.out.println(transformer.transform(element));
            }
        }
    }
}

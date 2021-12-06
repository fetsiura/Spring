package pl.coderslab.advanced.functionalinterfaces;

import java.util.List;

public class Main01 {


    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 10, 15, 20, 25, 30, 35, 50);

        Filter<Integer> lessThan20 = new IntegerFilter();

        printList(integers,lessThan20);

        System.out.println("-----------");

        printList(integers, v -> v %3 ==0);

    }


    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }

    }


}

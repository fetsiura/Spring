package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        numbers.stream()
                .map( n -> Math.pow(n,2) - 5)
                .filter(n -> n<20)
                .forEach(System.out::println);

    }
}

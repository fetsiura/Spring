package pl.coderslab.advanced.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> integers = create(numbers, v -> v < 6, t -> t + 10);

        integers.forEach(System.out::println);


    }


    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t){
        List<T> list = new ArrayList<>();

        for( S s : src){
            if(f.check(s)){
                list.add( t.transform(s));
            }
        }
        return list;
    }
}

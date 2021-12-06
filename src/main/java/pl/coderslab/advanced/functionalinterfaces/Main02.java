package pl.coderslab.advanced.functionalinterfaces;

import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 10, 15, 20, 25, 30, 35, 50);

        IntegerFilter less20 = new IntegerFilter();
        IntegerTransform transform = new IntegerTransform();

        printList(integers,less20,transform);

        System.out.println("----------");
        printList(integers, v -> v % 3 ==0 , v -> --v);
        System.out.println("----------");

        printList(integers, v ->v<20,v->--v);
    }



    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}

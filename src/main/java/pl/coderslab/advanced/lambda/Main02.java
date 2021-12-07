package pl.coderslab.advanced.lambda;

import java.util.function.Predicate;

public class Main02 {

    public static void main(String[] args) {


        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                return o instanceof String;
            }
        };


        String a = "coder";
        int b = 123;

        if(predicate.test(a)){
            System.out.println(a);
        }
        if(predicate.test(b)){
            System.out.println(b);
        }

        System.out.println("------------------");

        Predicate<Object> isNumber = v -> v instanceof Number;

        if(isNumber.test(a)){
            System.out.println(a);
        }
        if(isNumber.test(b)){
            System.out.println(b);
        }

    }
}

package pl.coderslab.advanced.lambda;

import java.util.function.Predicate;

public class Main02 {

    public static void main(String[] args) {
        Predicate<Object> isAString = (Object obj) -> {
            return obj instanceof String;
        };

        isAString = obj -> obj instanceof String;

        Object a = 1;
        if (isAString.test(a)) { // if (a instanceof String)
            System.out.println(a);
        }

        Object b = "abc";
        if (isAString.test(b)) { // if (b instanceof String)
            System.out.println(b);
        }

        Integer c = 45;
        if (isAString.test(c)) { // if (c instanceof String)
            System.out.println(c);
        }

        printConditionally(a, isAString);
        printConditionally(a, obj -> obj instanceof Integer);

        Predicate<Object> isANumber = obj -> Number.class.isAssignableFrom(obj.getClass());

        System.out.println("---------");
        printConditionally(a, isANumber);
        printConditionally(b, isANumber);
        printConditionally(c, isANumber);
    }

    public static <T> void printConditionally(T value, Predicate<T> predicate) {
        if (predicate.test(value)) {
            System.out.println(value);
        }
    }
}

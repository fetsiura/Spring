package pl.coderslab.advanced.functionalinterfaces;

public class GenericPair <T, R> {

    private final T a;
    private final R b;

    public GenericPair(T a, R b) {
        this.a = a;
        this.b = b;
    }

    public R getB() {
        return b;
    }

    public T getA() {
        return a;
    }
}

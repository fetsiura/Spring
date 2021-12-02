package pl.coderslab.advanced.functionalinterfaces;

public class Pair {

    private final Object a;
    private final Object b;

    public Pair(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    public Object getA() {
        return a;
    }

    public Object getB() {
        return b;
    }
}

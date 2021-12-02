package pl.coderslab.advanced.functionalinterfaces;

public class LessThan20IntegerFilter implements Filter <Integer> {

    @Override
    public boolean check(Integer value) {
        return value < 20;
    }
}

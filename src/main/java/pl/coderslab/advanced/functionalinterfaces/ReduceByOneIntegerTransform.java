package pl.coderslab.advanced.functionalinterfaces;

public class ReduceByOneIntegerTransform implements Transform<Integer, Integer> {

    @Override
    public Integer transform(Integer source) {
        if (source == null) {
            return 0;
        }
        return source - 1;
    }
}

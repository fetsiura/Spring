package pl.coderslab.advanced.functionalinterfaces;

public class IntegerTransform implements Transform<Integer, Integer>{


    @Override
    public Integer transform(Integer v) {
        return --v;
    }
}

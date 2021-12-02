package pl.coderslab.advanced.lambda;

@FunctionalInterface
public interface MathOperation<T extends Number> {

    T operate(T value);
}

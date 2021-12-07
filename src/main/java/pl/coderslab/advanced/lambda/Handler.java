package pl.coderslab.advanced.lambda;

@FunctionalInterface
public interface Handler <T extends Number> {
    T handler(T value);
}
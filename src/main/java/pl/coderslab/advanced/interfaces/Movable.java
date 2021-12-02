package pl.coderslab.advanced.interfaces;

public interface Movable {

    void start();

    default void stop() {};
}

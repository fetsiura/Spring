package pl.coderslab.advanced.interfaces;

public class Person implements Moveable {
    @Override
    public void start() {
        System.out.println("człowiek idzie");
    }

    @Override
    public void stop() {
    }
}

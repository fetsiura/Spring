package pl.coderslab.advanced.interfaces;

public class Cat implements Movable {

    @Override
    public void start() {
        System.out.println("Kot pełznie po płocie");
    }

    @Override
    public void stop() {
        System.out.println("Czas miałczenia!");
    }
}

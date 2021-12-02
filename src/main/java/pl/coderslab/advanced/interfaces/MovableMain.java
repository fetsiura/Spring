package pl.coderslab.advanced.interfaces;

import java.util.List;

public class MovableMain {

    public static void main(String[] args) {


        List<Movable> movables = List.of(new Cat(), new Car(), new Person());

        for (Movable movable : movables) {
            movable.start();
        }

        for (Movable movable : movables) {
            movable.stop();
        }
    }
}

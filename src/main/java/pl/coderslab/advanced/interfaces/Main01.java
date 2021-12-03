package pl.coderslab.advanced.interfaces;

import java.util.List;

public class Main01 {

    public static void main(String[] args) {


        List<Moveable> moveables = List.of(
                new Car(),
                new Cat(),
                new Person()
        );

        for(Moveable m : moveables){
            m.start();
        }
    }
}

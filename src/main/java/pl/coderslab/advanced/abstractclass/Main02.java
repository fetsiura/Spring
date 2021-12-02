package pl.coderslab.advanced.abstractclass;

import java.lang.annotation.Retention;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(4.0),
                new Square(20.5),
                new Rectangle(5, 8.25)
        );

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculateCircuit();

            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.printf("Prostokąt o bokach %.2f i %.2f - pole = %.2f, obwód = %.2f %n", r.getA(), r.getB(), r.getArea(), r.getCircuit());
            }
            else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.printf("Koło o promieniu %.2f - pole = %.2f, obwód = %.2f %n", c.getRadius(), c.getArea(), c.getCircuit());
            }
            else if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.printf("Kwadrat o boku %.2f - pole = %.2f, obwód = %.2f %n", s.getA(), s.getArea(), s.getCircuit());
            }

        }

    }
}

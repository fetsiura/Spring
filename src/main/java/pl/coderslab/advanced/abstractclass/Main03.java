package pl.coderslab.advanced.abstractclass;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {

        List<Shape> shapes = List.of(
                new Circle(4.0),
                new Square(20.5),
                new Rectangle(5,4.11)
        );
        for(Shape shape : shapes){

            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.printf("Prostokąt o bokach %.2f i %.2f - pole = %.2f, obwód = %.2f %n", r.getA(), r.getB(), r.getArea(), r.getCircuit());
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.printf("Koło o promieniu %.2f - pole = %.2f, obwód = %.2f %n", c.getRadius(), c.getArea(), c.getCircuit());
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.printf("Kwadrat o boku %.2f - pole = %.2f, obwód = %.2f %n", s.getA(), s.getArea(), s.getCircuit());
            }
        }
    }
}

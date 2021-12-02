package pl.coderslab.advanced.abstractclass;

public class Circle extends Shape {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void calculateCircuit() {
        this.circuit = 2 * Math.PI * radius;
    }
}

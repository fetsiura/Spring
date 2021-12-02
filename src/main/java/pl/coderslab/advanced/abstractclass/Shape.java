package pl.coderslab.advanced.abstractclass;

public abstract class Shape {

    protected double area;
    protected double circuit;

    public abstract void calculateArea();
    public abstract void calculateCircuit();

    public double getArea() {
        return area;
    }

    public double getCircuit() {
        return circuit;
    }

}

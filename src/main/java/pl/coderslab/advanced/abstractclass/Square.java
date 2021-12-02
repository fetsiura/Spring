package pl.coderslab.advanced.abstractclass;

public class Square extends Shape {

    protected double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void calculateArea() {
        this.area = a * a;
    }

    @Override
    public void calculateCircuit() {
        this.circuit = 4 * a;
    }

}

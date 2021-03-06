package pl.coderslab.advanced.abstractclass;

public class Rectangle extends Shape{

    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void calculateArea() {
        this.area  = a*b;
    }

    @Override
    public void calculateCircuit() {
        this.circuit = 2*a+2*b;
    }
}

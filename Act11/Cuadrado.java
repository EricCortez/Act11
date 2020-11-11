package Act11;


import java.util.Scanner;

public class Cuadrado implements Shape {

    protected double sideLength;

    public Cuadrado(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }



    @Override
    public double getArea() {
        return sideLength*sideLength;
    }

    @Override
    public double getPerimetro() {
        return sideLength*4;
    }
}

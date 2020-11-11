package Act11;

public class Circulo implements Shape {



    public static final double PI = 3.141592;
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiameter() {
        return radio * 2;
    }

    public double area() {
        return PI * radio * radio;
    }

    public double perimeter() {
        return PI * getDiameter();
    }



    @Override
    public double getArea() {
        return PI * radio*radio;
    }

    @Override
    public double getPerimetro() {
        return PI* getDiameter();
    }
}

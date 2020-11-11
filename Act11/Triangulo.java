package Act11;

public class Triangulo implements Shape {

    private double Lado;   // cm
    private double Altura; // cm

    public Triangulo(double sideLength) {
        this.Lado = sideLength;
        this.Altura = Altura();
    }

    public void setLado(double lado) {

        this.Lado = lado;
        this.Altura = Altura();
    }

    public double getLado() {
        return Lado;
    }

    public double getHeightLength() {
        return Altura;
    }

    public double area() {
        return (Lado * Altura) / 2.0;
    }

    public double perimeter() {
        return Lado * 3.0;
    }

    private double Altura() {
        return (Math.sqrt(3.0) * this.Lado) / 2.0;
    }


    @Override
    public double getArea() {
        return (Lado * Altura) / 2.0;
    }

    @Override
    public double getPerimetro() {
        return Lado * 3.0;
    }
}

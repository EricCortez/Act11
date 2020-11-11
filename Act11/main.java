package Act11;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Error
        Scanner entrada = new Scanner(System.in);
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimetro() {
                return 0;
            }
        };
        int valor=0,base,lado;
        int x=0;
        do {
            System.out.println("interfaces con figuras  \n   "+"1 Circulo\n "+"2 Triangulo\n "+"3 cuadrado\n "+"\n "+"5 salir\n ");
            x = entrada.nextInt();

            switch (x) {
                case 1:

                    System.out.println("ingresa el valor del radio");
                    valor=entrada.nextInt();

                    Circulo circulo=new Circulo(valor);
                    System.out.println("Area"+circulo.getArea());
                    System.out.println(circulo.getPerimetro());


                    break;
                case 2:

                    System.out.println("ingresa el valor de la altura");
                    valor=entrada.nextInt();
                    System.out.println("ingresa el valor de la base");
                    base=entrada.nextInt();

                    Triangulo triangulo=new Triangulo(base);
                    triangulo.setLado(valor);
                    System.out.println("Area: "+triangulo.getArea());
                    System.out.println("perimetro : "+triangulo.getPerimetro());



                    break;
                case 3:

                    System.out.println("ingresa el valor del lado del cuadro");
                    lado=entrada.nextInt();
                    Cuadrado cuadrado=new Cuadrado(lado);

                    System.out.println("Area: "+cuadrado.getArea());
                    System.out.println("perimetro : "+cuadrado.getPerimetro());


                    break;
                default:System.out.println("opcion no valida");
            }


    }while (x!=5);
}}

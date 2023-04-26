package Guia7Java;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargando datos del rectangulo... ");
        System.out.println("Ingrese la base: ");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        this.altura = leer.nextInt();
    }

    public double areaRectangulo() {
        double area = 1;
        area = (base * altura);
        return area;
    }

    public double perimetroRectangulo() {
        double perimetro = 1;
        perimetro = (base * altura) / 2;
        return perimetro;
    }

    public void dibujoRectangulo() {
        int i, j;
        for (i = 1; i <= base; i++) {
            for (j = 1; j <= altura; j++) {
                if (i == 1 || i == base || j == 1 || j == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}

package guia7javapoo;

import Guia7Java.Circunferencia;

public class Ej2Circunferencia {

    public static void main(String[] args) {
        Circunferencia radio1 = new Circunferencia();
        Circunferencia radio2 = new Circunferencia();
        radio1.setRadio(8);
        radio2.setRadio(12);
        
        System.out.println("Para el radio: " +radio1.getRadio() );
        System.out.println("El area es: " + radio1.areaCircunferencia());
        System.out.println("El perimetro es: " + radio1.perimetroCircunferencia());

        System.out.println("Para el radio: " +radio2.getRadio() );
        System.out.println("El area es: " + radio2.areaCircunferencia());
        System.out.println("El perimetro es: " + radio2.perimetroCircunferencia());

    }

}

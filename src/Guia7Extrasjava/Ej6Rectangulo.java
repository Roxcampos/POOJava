
package Guia7Extrasjava;
import Guia7Java.Rectangulo;
import java.util.Scanner;

public class Ej6Rectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       Rectangulo rectangulo1= new Rectangulo(4,6); 
        System.out.println("El area es "+rectangulo1.areaRectangulo());
    }
    
}


package guia7javapoo;

import Guia7Java.Rectangulo;

public class Ej4Rectangulo {

   
    public static void main(String[] args) {
      
        Rectangulo rectangulo1 = new Rectangulo();
        
        rectangulo1.crearRectangulo();
        
        System.out.println("Area del rectangulo: "+rectangulo1.areaRectangulo());
        System.out.println("Perimetro del rectangulo: "+rectangulo1.perimetroRectangulo());
        
        rectangulo1.dibujoRectangulo();
        
    }
    
}

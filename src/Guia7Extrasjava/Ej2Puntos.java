
package Guia7Extrasjava;

import Guia7Extras.Puntos;

public class Ej2Puntos {

    
    public static void main(String[] args) {
        Puntos p1 =new Puntos();
       
         p1.ingresarPuntos();
       
         
         
        System.out.println("Ingresaste para el P1(" + p1.getX1() + "," +p1.getY1()+")");
        System.out.println("Ingresaste para el P2(" + p1.getX2() + "," +p1.getY2()+")");
        System.out.println("La distancia entre ambos puntos es: "+p1.distanciaPuntos());
    }
    
}

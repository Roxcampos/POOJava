
package guia7javapoo;

import Guia7Java.Operacion;

public class Ej3Operaciones {

    
    public static void main(String[] args) {
       Operacion operaciones = new Operacion();
       operaciones.crearOperacion();
       
        System.out.println("Suma: "+operaciones.sumar());
        System.out.println("Resta: "+operaciones.restar());
        System.out.println("Multiplicación: "+operaciones.multiplicar());
        System.out.println("División: "+operaciones.dividir());
    }
    
}

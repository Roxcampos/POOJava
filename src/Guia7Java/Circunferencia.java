
package Guia7Java;


public class Circunferencia {

   private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int rad) {
        radio = rad;
    }
    
    public void crearCircunferencia (int radiox){
        radio=radiox;
    }
     public int getcrearCircunferencia (){
        return radio;
    }
     public double areaCircunferencia (){
         double area=1;
        area =(3.1416*radio*radio);
        return area;
    }
     public double perimetroCircunferencia (){
        double perimetro=1;
         perimetro=2*3.1416*radio;
        return perimetro;
    }
   
    
    
    
}


package Guia7Extras;
import java.util.Scanner;


public class Cuenta {
     public String titular;
    public double saldo;
    public double retiro;
    public String opc;
    
    public Cuenta() {
    }

    public Cuenta(String titular, double saldo, double retiro) {
        this.titular = titular;
        this.saldo = saldo;
        this.retiro = retiro;
    }
    
    
    public void retirar_dinero(){
       
        Scanner leer =new Scanner(System.in);
        Scanner leer2 =new Scanner(System.in);
        Scanner leer3 = new Scanner (System.in);
        
        System.out.println("Ingrece el nombre del titular:");
        this.titular=leer.nextLine();
        
        this.saldo=(int)(Math.random()*1000);
        
        do {
            System.out.println("Su salado es "+saldo);
         
            System.out.println("Ingece el monto a retirar");
        this.retiro=leer2.nextInt();
       // Scanner out
        if (saldo-retiro<=0){
            System.out.println("Fondo insuficientes");
        }else{
            saldo=saldo-retiro;
        }
            System.out.println("Desea hacer otro retiro S/N");
            opc=leer.nextLine();
            
        } while (opc.equalsIgnoreCase("S"));
        
            
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
}
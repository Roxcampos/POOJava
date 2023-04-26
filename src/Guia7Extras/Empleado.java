
package Guia7Extras;

import java.util.Scanner;

public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    public String opc;

    
    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario, String opc) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.opc = opc;
    }
    
    
     
    
    public void calcular_aumento(){
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner (System.in);
        System.out.println("NOMINA DE EMPLEADOS");
        do {
            
            System.out.println("Ingrese el nombre del empleado: ");
        this.nombre=leer.nextLine();
        
        System.out.println("Ingrese la edad:");
        this.edad=leer.nextInt();
                
        System.out.println("Ingrese su salario:");
        this.salario=leer.nextDouble();
        
         leer.nextLine();  //se coloca para poder no tener que colocar otro escanner
         
        if(edad>=30){
            System.out.println("El aumento es del 10%");
            salario=salario*1.1;
            System.out.println("El salario con aumento es $ "+salario);
        }else{
            System.out.println("el aumento es del 5%");
            salario=salario*1.05;
             System.out.println("El salario con aumento es $ "+salario);
        }
         System.out.println("Desea hacer otro calculo S/N");
            opc=leer.nextLine();
            
        } while (opc.equalsIgnoreCase("S"));
        System.out.println("Ud. ha salido del programa");
        
    }

   
} 


package Guia7Java;

import java.util.Scanner;

public class Operacion {

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    private int numero1;
    private int numero2;

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargando numeros... ");
        System.out.println("Ingrese el número 1: ");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese el número 2: ");
        this.numero2 = leer.nextInt();
    }

    public int sumar() {
        int suma = 0;
        suma = numero1 + numero2;
        return suma;
    }

    public int restar() {
        int resta = 0;
        resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar() {
        int multip=0;
      if ( numero1==0 || numero2 ==0){
        System.out.println("Error; resultado = 0");
        }else {
            multip=numero1*numero2;
            }
            
               
        return multip;
    }

    public double dividir() {
        double division=0;
        if ( numero1==0 || numero2 ==0){
        System.out.println("Error; resultado = 0");
    }else {
            division=numero1 / numero2;;
            }
        
        return division;
    }
}

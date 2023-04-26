package Guia7Extras;

import java.util.Scanner;

public class Juego {

    public int num1, num2, numInt;
    public String opc;
    public int num1gana;
    public int num2gana;

    public Juego() {
    }

    public Juego(int num1, int num2, int numInt, String opc, int num1gana, int num2gana) {
        this.num1 = num1;
        this.num2 = num2;
        this.numInt = numInt;
        this.opc = opc;
        this.num1gana = num1gana;
        this.num2gana = num2gana;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("ADIVINAMOS EL NUMERO");
int cont1=0,cont2=0;

        System.out.println("Ingrese un numero a adivinar: ");
        num1 = leer.nextInt();
        System.out.println("El juego consiste en averiguar un número secreto entre 1 y 10");
        do {
            System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 10: ");
            num2 = leer.nextInt();

            for (int i = 0; i <= 4; i++) {

                // Primero se evalúa si se ha acertado.
                if (num1 == num2) {
                    System.out.println("¡Has acertado!");
                    
                } // Luego da la partida por perdida si ya has gastado 5 intentos.     
                else if (i == 4) {
                    System.out.println("Lo siento: ¡has perdido!. El número era el: " + num1);
                   
                } // Si no es ninguno de los casos anteriores, comparamos números.
                else if (num1 > num2) {
                    System.out.println("El número secreto es MAYOR que " + num2);
                } else if (num1 < num2) {
                    System.out.println("El número secreto es MENOR que " + num2);
                }

                // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.
                if (i <= 1) {
                    System.out.print("Otro intento: ");
                    num2 = leer.nextInt();
                } else if (i == 2) {
                    int x = (int) (num1 / 10);

                    System.out.print("Inténtalo de nuevo: ");
                    num2 = leer.nextInt();
                } else if (i >= 3) {
                    System.out.print("Último intento: ");
                    num2 = leer.nextInt();
                }
            }

            System.out.println("Desea seguir jugando S/N");
            this.opc = leer2.nextLine();
            if (opc.equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nuevo numero a adivinar: ");
                this.num1 = leer2.nextInt();
            }
        } while (opc.equalsIgnoreCase("S"));
        
        System.out.println("El jugador 1 gano " + num1gana + " veces");
        System.out.println("El jugador 2 gano " + num2gana + " veces");
    }
}

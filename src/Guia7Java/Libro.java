package Guia7Java;

import java.util.Scanner;

public class Libro {



    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
   
   private String ISBN, titulo, autor;
   private int paginas;

    public void cargarLibros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargando libros... ");
        System.out.println("Ingrese el ISBN: ");
        this.ISBN = leer.nextLine();
        System.out.println("Ingrese el Título: ");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el Autor: ");
        this.autor = leer.nextLine();
        System.out.println("Ingrese el Número de páginas: ");
        this.paginas = leer.nextInt();

    }

    public void mostrarLibros() {
        System.out.print("-------");
        System.out.println("LIBROS REGISTRADOS");
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.paginas);

    }
}

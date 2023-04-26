package Guia7Extras;

import java.util.Scanner;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void cargarCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargando canciones... ");
        System.out.println("Ingrese el titulo: ");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el autor: ");
        this.autor = leer.nextLine();
    }

    public void mostrarCancion() {
        System.out.print("-------");
        System.out.println("CANCIONES CARGADAS");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}

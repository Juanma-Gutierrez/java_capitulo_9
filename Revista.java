/**
 * Revista.java
 *
 * @version: 09/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Revista extends Publicacion {
    int numero;

    public Revista() {
    }

    public Revista(String isbn, String titulo, int anyo, int numero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anyo = anyo;
        this.numero = numero;
    }

    
}
